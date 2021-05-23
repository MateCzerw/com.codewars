package com.codewars.buildSquare;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BuildSquare {
    public static final String generateShape(int n) {

        return IntStream
                .range(0,n)
                .mapToObj(i -> "+".repeat(n))
                .collect(Collectors.joining("\n"));
    }
}
