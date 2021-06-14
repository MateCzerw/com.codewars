package com.codewars.sortTheOdd;


import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class SortTheOdd {

    public static int[] sortArray(int[] array) {
        PrimitiveIterator.OfInt sortedOdds = IntStream
                .of(array)
                .filter(i -> i % 2 == 1)
                .sorted()
                .iterator();

        return IntStream
                .of(array)
                .map(i -> i % 2 == 0 ? i : sortedOdds.nextInt())
                .toArray();
    }

}
