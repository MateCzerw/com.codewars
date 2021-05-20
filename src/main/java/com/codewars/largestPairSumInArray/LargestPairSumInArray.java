package com.codewars.largestPairSumInArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LargestPairSumInArray {
    public static int largestPairSum(int[] numbers){

        List<Integer> sortedList = Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        return sortedList.get(0) + sortedList.get(1);
    }
}
