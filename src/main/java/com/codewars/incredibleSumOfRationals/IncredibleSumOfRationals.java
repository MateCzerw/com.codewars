package com.codewars.incredibleSumOfRationals;

import java.util.stream.IntStream;

public class IncredibleSumOfRationals {
    public static String sumFracts(int[][] l) {

        if(l.length == 0) return null;
        final int lcmOfAllDenominators = IntStream
                .range(0, l.length)
                .map(i -> l[i][1])
                .reduce((o1, o2) -> lcm(o1, o2))
                .orElseThrow(() -> new RuntimeException("Do not divide by 0!"));

        final int sumOfNominators = IntStream
                .range(0, l.length)
                .map(i -> l[i][0] * lcmOfAllDenominators / l[i][1])
                .reduce(0, (o1, o2) -> o1 + o2);

        int gcd = gcd(sumOfNominators,lcmOfAllDenominators);


        return sumOfNominators % lcmOfAllDenominators  == 0 ?
                sumOfNominators / lcmOfAllDenominators + "" :
                String.format("[%d, %d]", sumOfNominators / gcd, lcmOfAllDenominators / gcd);

    }

    //greatest common divisor
    private static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }

    // least common multiple
    private static int lcm(int n1, int n2) {

        return n1 * n2 / gcd(n2, n1 % n2);
    }

}
