package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractGame implements Game {

    Integer sizeWord;
    Integer attempts;
    String word;
    GameStatus gameStatus = GameStatus.INIT;


    @Override
    public void start(Integer sizeWord, Integer attempts) {
        this.sizeWord = sizeWord;
        this.attempts = attempts;
        word = generateWorld();//слово загаданное пк
        this.gameStatus = GameStatus.START;
    }

    @Override
    public Answer inputValue(String value) {
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < Math.min(value.length(),sizeWord); i++) {
            if (value.charAt(i) == word.charAt(i)) {
                bulls++;
            }
            Character character = value.charAt(i);
            if (word.contains(character.toString())) {
                cows++;
            }
        }
        this.attempts--;
        if (bulls == sizeWord){
            gameStatus=GameStatus.WIN;
        } else if (this.attempts == 0){
            gameStatus=GameStatus.LOSE;
        }
        return new Answer(value, cows, bulls);
    }

    @Override
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }

    private String generateWorld() {
        Random random = new Random();
        List<String> charList = generateCharList();
        String resWorld = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(charList.size());
            resWorld = resWorld.concat(charList.get(randomIndex));
            charList.remove(randomIndex);
        }
        return resWorld;
    }

    abstract List<String> generateCharList();
}
