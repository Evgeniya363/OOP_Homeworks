package org.example;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<String>();
        for (char ch = 'а'; ch <= 'я'; ch++) {
            charList.add(Character.toString(ch));
        }
        return charList;
    }
}
