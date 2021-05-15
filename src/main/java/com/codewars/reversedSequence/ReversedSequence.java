package com.codewars.reversedSequence;

import java.util.Collections;
import java.util.stream.IntStream;

public class ReversedSequence {
    public static int[] reverse(int n){
        return IntStream
                .range(1, n + 1)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
    }
}
