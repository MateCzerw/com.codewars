package com.codewars.movesInSquaredStrings3;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Opstrings {
    public static String vertMirror(String strng) {
        return Arrays
                .stream(strng.split("\n"))
                .map(e -> new StringBuilder(e).reverse())
                .collect(Collectors.joining("\n"));
    }

    public static String horMirror(String strng) {
        String[] lines = strng.split("\n");
        int num = lines.length - 1;
        return IntStream.range(0, lines.length)
                .mapToObj(e -> lines[num - e])
                .collect(Collectors.joining("\n"));
    }

    public static String oper(Function<String, String> function, String s) {
        return function.apply(s);
    }
}
