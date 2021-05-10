package com.codewars.howMuch;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class HowMuch {
    public static String howmuch(int m, int n) {
        List<Integer[]> result = new LinkedList<>();
        int newM = m;
        int newN = n;
        if(m > n) {
            newM = n;
            newN = m;
        }

        for (int i = newM; i <= newN; i++) {
            double c = ((double) i - 1) / 9;
            double b = ((double) i - 2) / 7;
            if(c % 1 == 0 && b % 1 == 0) result.add(new Integer[]{i,(int) b, (int) c});
        }

        String resultString =result.stream()
                                        .map(array -> String
                                                .format("[M: %d B: %d C: %d]",
                                                        array[0],
                                                        array[1],
                                                        array[2]))
                                        .collect(Collectors.joining());

        return "[" + resultString + "]";

    }
}
