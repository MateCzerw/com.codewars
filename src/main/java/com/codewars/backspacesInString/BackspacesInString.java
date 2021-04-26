package com.codewars.backspacesInString;

import java.util.LinkedList;
import java.util.List;


public class BackspacesInString {
    public String cleanString(String word) {
        List<Character> wordWithoutBackspaces = new LinkedList<>();
        int backspacesCounter = 0;
        for (int i = word.length() - 1; i >= 0; i--) {
            if(word.charAt(i) == '#') backspacesCounter++;
            else{
                if(backspacesCounter == 0) wordWithoutBackspaces.add(word.charAt(i));
                else backspacesCounter--;
            }

        }

        return wordWithoutBackspaces
                .stream()
                .collect(StringBuilder::new, (b,c) -> b.insert(0,(char)c), (b1,b2) -> b1.insert(0, b2))
                .toString();
    }
}
