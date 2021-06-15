package com.codewars.gravityFlip;

import java.util.Arrays;
import java.util.Comparator;

public class GravityFlip {
    public static int[] flip(char dir, int[] arr) {
        switch (dir) {
            case 'R':
                return Arrays
                        .stream(arr)
                        .sorted()
                        .toArray();
            case 'L':
                return Arrays
                        .stream(arr)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();
            default:
                throw new IllegalArgumentException();
        }
    }
}
