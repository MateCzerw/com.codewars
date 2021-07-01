package com.codewars.beginnerSeriesSumOfNumbers;

import java.util.stream.IntStream;

public class Sum {
    public int GetSum(int a, int b)
    {
        int max = a >= b ? a : b;
        int min = a < b ? a : b;

        return IntStream.rangeClosed(min,max)
                .sum();
    }
}
