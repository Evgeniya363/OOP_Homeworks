package org.example.bullCowGame;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
          charList.add(Character.toString(ch));
        }
        return charList;
    }
}
