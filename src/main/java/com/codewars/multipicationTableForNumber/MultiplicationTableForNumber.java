package com.codewars.multipicationTableForNumber;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> i + " * " + num + " = " + i * num)
                .collect(Collectors.joining("\n"));
    }
}
