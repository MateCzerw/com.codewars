package com.codewars.summy;

import java.util.Arrays;

public class Summy {
    static long summy(String stringOfInts) {
        return Arrays.stream(stringOfInts.split(" "))
                .map(Long::parseLong)
                .reduce(0L, Long::sum);
    }
}
