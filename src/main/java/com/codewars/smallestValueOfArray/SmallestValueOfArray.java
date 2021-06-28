package com.codewars.smallestValueOfArray;

import java.util.stream.IntStream;

public class SmallestValueOfArray {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        int smallestValue =
                IntStream.range(0,numbers.length)
                        .map(i -> numbers[i])
                        .min().orElseThrow(() -> {throw new IllegalArgumentException();});
        switch (toReturn) {
            case "index":
                return IntStream.range(0, numbers.length)
                        .filter(i -> numbers[i] == smallestValue)
                        .findFirst()
                        .orElseThrow(() -> {throw new IllegalArgumentException();});
            case "value":
                return smallestValue;
            default:
                throw new IllegalArgumentException();
        }
    }
}
