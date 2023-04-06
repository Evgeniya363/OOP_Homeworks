package org.example.bullCowGame;

public interface Game {
    void start(Integer sizeWord, Integer attempts);

    Answer inputValue(String value);

    GameStatus getGameStatus();

    Integer getAttempts();

    String getWord();
}
