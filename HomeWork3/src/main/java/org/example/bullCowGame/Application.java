package org.example.bullCowGame;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("1 - цифра\n2 - русское слово\n3 - английское слово");
        Scanner scanner = new Scanner(System.in);
        System.out.print("выберите игру: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        Game game = null;

        switch (num) {
            case 1:
                game = new NumberGame();
                break;
            case 2:
                game = new RuGame();
                break;
            case 3:
                game = new EnGame();
                break;
            default:
                System.out.println("данная игра еще не добавлена!");
        }
        if (num > 0 && num < 4) {
            System.out.print("Введите количество символов: ");
            final int wordSize = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Введите количество попыток: ");
            final int ATTEMPTS = scanner.nextInt();
            scanner.nextLine();
            game.start(wordSize, ATTEMPTS);
            while (game.getGameStatus().equals(GameStatus.START)) {
                System.out.printf("Попытка %d из %d. Ход: ", ATTEMPTS - game.getAttempts() + 1, ATTEMPTS);
                String answer = scanner.nextLine();
                Answer answerGame = game.inputValue(answer);
                System.out.println("коров - " + answerGame.getCow() + " , быков - " + answerGame.getBull());
            }
            System.out.println(game.getGameStatus());
            System.out.println("Искомая последовательность: " + game.getWord());
        }
        scanner.close();
    }
}
