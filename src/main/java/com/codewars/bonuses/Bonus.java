package com.codewars.bonuses;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bonus {
    public static long[] bonus(int[] arr, long s) {
        List<BigDecimal> paymentCoefficients = IntStream
                                                .range(0,arr.length)
                                                .mapToObj(i -> BigDecimal.valueOf(0))
                                                .collect(Collectors
                                                        .toCollection(ArrayList::new));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < paymentCoefficients.size(); j++) {
                paymentCoefficients.set(i, paymentCoefficients
                        .get(i)
                        .add(BigDecimal.valueOf((double) arr[i] / arr[j])));
            }
        }
        return  paymentCoefficients.stream()
                        .map(coefficient -> BigDecimal
                                .valueOf(s)
                                .divide(coefficient, 2, RoundingMode.HALF_UP))
                        .mapToLong(payment -> payment.longValue())
                        .toArray();
    }
}
