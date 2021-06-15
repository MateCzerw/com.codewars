package com.codewars.movesInSquaredStrings3;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Opstrings1 {

    public static String rot(String strng) {
        String[] split = strng.split("\n");

        int num=split.length - 1;
        return IntStream.rangeClosed(0, num)
                .mapToObj(i->split[num-i])
                .map(e -> new StringBuilder(e)
                        .reverse()
                        .toString())
                .collect(Collectors.joining("\n"));
    }

    public static String selfieAndRot(String strng) {

        String stringWithDots = Arrays
                .stream(strng.split("\n"))
                .map(e -> e + ".".repeat(strng.indexOf("\n")))
                .collect(Collectors.joining("\n"));

        String rotatedStringWithDots = Arrays
                .stream(rot(strng).split("\n"))
                .map(e -> ".".repeat(strng.indexOf("\n")) + e)
                .collect(Collectors.joining("\n"));

        return stringWithDots + "\n" + rotatedStringWithDots;
    }

    public static String oper(Function<String, String> function, String s) {

        return function.apply(s);
    }
}

