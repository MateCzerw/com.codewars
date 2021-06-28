package com.codewars.triangleArea;

import java.util.Arrays;

public class TriangleArea {
    public static float tArea(String tStr) {
        int[] dots = Arrays.stream(tStr.trim().split("\n"))
                .map(e -> (int) e.chars()
                                    .map(c -> (char) c)
                                    .filter(c -> c == '.')
                                    .count())
                .mapToInt(i -> i)
                .toArray();
        return (float) (dots.length - 1) * (dots[dots.length - 1] - 1) / 2;
    }
}
