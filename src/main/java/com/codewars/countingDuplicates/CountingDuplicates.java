package com.codewars.countingDuplicates;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        Map<Character,Integer> LetterAndAppearanceNumberInWord = new HashMap<>();

        text
                .toLowerCase()
                .chars()
                .mapToObj( c -> (char) c)
                .forEach(letter -> {
                    if(LetterAndAppearanceNumberInWord.containsKey(letter))
                        LetterAndAppearanceNumberInWord
                                .put(letter,LetterAndAppearanceNumberInWord.get(letter) + 1);
                    else LetterAndAppearanceNumberInWord
                            .put(letter,1);
                });

        return (int) LetterAndAppearanceNumberInWord
                        .entrySet()
                        .stream()
                        .filter(letter -> letter.getValue() > 1)
                        .count();
    }
}
