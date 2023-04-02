package org.example;

import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    static Game game = null;
    static Integer wordSize;
    static Integer attempts;
    static int mode;


    public static void main(String[] args) {
        do {
            mode = inputInt("Варианты игры:\n1 - цифра\n2 - русское слово\n"
                    + "3 - английское слово\n0 - Выход\nВаш выбор: ");
            if (mode > 0 && mode < 4) {
                wordSize = inputInt("Введите количество символов: ");
                attempts = inputInt("Введите количество попыток: ");
                startGame();
                System.out.println("Для продолжения нажмите Enter...");
                scanner.nextLine();
            }
        } while (mode > 0);
        System.out.println("Игра завершена");
        scanner.close();
    }

    private static void startGame() {
        switch (mode) {
            case 1 -> game = new NumberGame();
            case 2 -> game = new RuGame();
            case 3 -> game = new EnGame();
        }
        game.start(wordSize, attempts);
        while (game.getGameStatus().equals(GameStatus.START)) {
            System.out.printf("Попытка %d из %d. Ход: ", attempts - game.getAttempts() + 1, attempts);
            String answer = scanner.nextLine();
            Answer answerGame = game.inputValue(answer);
            System.out.println("коров - " + answerGame.getCow() + " , быков - " + answerGame.getBull());
        }
        System.out.println(game.getGameStatus());
        System.out.println("Искомая последовательность: " + game.getWord());
    }

    private static int inputInt(String message) {
        System.out.print(message);
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }
}
