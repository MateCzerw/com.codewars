package com.codewars.lostNumber;

import java.util.Arrays;

public class LostNumber {
    public static int findDeletedNumber(int[] arr, int[] mixedArr) {
        long sumOfArr = Arrays.stream(arr).sum();

        long sumOfMixedArr = Arrays.stream(mixedArr).sum();

        return (int) (sumOfArr - sumOfMixedArr);
    }
}
