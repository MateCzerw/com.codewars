package com.codewars.highAndLow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighAndLow {
    public static String highAndLow(String numbers) {
        List<Integer> sortedNumbers = Arrays
                .stream(numbers.split("\\s+"))
                .map(number -> Integer.valueOf(number))
                .sorted()
                .collect(Collectors.toList());


        return String.format("%d %d", sortedNumbers.get(sortedNumbers.size() - 1), sortedNumbers.get(0));
    }
}
