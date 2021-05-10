package com.codewars.differenceOf2;

import java.util.*;
import java.util.stream.Collectors;

public class DifferenceOf2 {

        public static int[][] twosDifference(int[] a) {
            var s = Arrays.stream(a).boxed().collect(Collectors.toSet());
            return Arrays.stream(a).boxed().filter(x -> s.contains(x + 2)).sorted().map(x -> new int[]{x, x + 2}).toArray(int[][]::new);
        }
}
