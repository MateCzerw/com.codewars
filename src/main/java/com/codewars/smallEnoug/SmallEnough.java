package com.codewars.smallEnoug;

import java.util.Arrays;

public class SmallEnough {
    public static boolean smallEnough(int[] numbers, int limit)
    {
        return Arrays
                .stream(numbers)
                .filter(number -> number <= limit)
                .count() == numbers.length;
    }
}
