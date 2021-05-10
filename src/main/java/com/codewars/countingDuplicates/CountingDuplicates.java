package com.codewars.countingDuplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        Map<Character,Long> LetterAndAppearanceNumberInWord =
                text
                .toLowerCase()
                .chars()
                .mapToObj( c -> (char) c)
                .collect(groupingBy(identity(), counting()));

        return (int) LetterAndAppearanceNumberInWord
                        .values()
                        .stream()
                        .filter(value -> value > 1)
                        .count();
    }
}
