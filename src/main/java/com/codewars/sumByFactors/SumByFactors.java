package com.codewars.sumByFactors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumByFactors {
    public static String sumOfDivided(int[] l) {
        int max = Arrays.stream(l)
                .map(Math::abs)
                .max()
                .orElse(0);

        Map<Integer, Integer> results = new TreeMap<>();

        List<Integer> primeNumbers = createPrimeNumbers(max);

        primeNumbers.forEach(
                e -> {
                    int sum = 0;
                    int numberOfFactors = 0;
                    for (int i = 0; i < l.length; i++) {
                        if (l[i] % e == 0) {
                            sum += l[i];
                            numberOfFactors++;
                        }
                    }
                    if (numberOfFactors != 0) results.put(e, sum);
                }
        );

        return results
                .entrySet()
                .stream()
                .map(e -> String.format("(%d %d)", e.getKey(), e.getValue()))
                .collect(Collectors.joining());
    }

//implementation of Eratostenesa sieve http://www.algorytm.edu.pl/algorytmy-maturalne/sito-eratostenesa.html
    private static List<Integer> createPrimeNumbers(int max) {
        boolean[] isPrimeNumber = new boolean[max + 1];
        IntStream
                .range(0, max + 1)
                .forEach(e -> isPrimeNumber[e] = true);

        for (int i = 2; i < isPrimeNumber.length; i++) {
            if (isPrimeNumber[i]) {
                for (int j = 2 * i; j < isPrimeNumber.length; j += i) {
                    isPrimeNumber[j] = false;
                }
            }
        }
        return IntStream
                .range(2, max + 1)
                .filter(e -> isPrimeNumber[e])
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
    }
}
