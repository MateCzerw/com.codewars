package com.codewars.alphabetSymetry;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr){
        return Arrays
                .stream(arr)
                .map(String::toLowerCase)
                .mapToInt(AlphabetSymmetry::calculatePositions)
                .toArray();

    }

    private static int calculatePositions(String word){
        return (int) IntStream
                        .range(0,word.length())
                        .filter(i -> word.charAt(i) == 97 + i)
                        .count();
    }
}
