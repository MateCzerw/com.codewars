package com.codewars.easyLine;

import java.math.BigInteger;

public class EasyLine {
    public static BigInteger easyLine(int n) {
        BigInteger[][] coefficients = new BigInteger[n + 1][n + 1];
        BigInteger result = BigInteger.ZERO;
        for (int i = 1; i < coefficients.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j == 0) {
                    coefficients[i][j] = BigInteger.ONE;
                    continue;
                }
                if (j == i) {
                    coefficients[i][j] = BigInteger.ONE;
                    continue;
                }
                coefficients[i][j] = coefficients[i - 1][j - 1].add(coefficients[i - 1][j]);
            }
        }
        for (int i = 0; i <= n; i++) {
            result = result.add(coefficients[n][i].pow(2));
        }
        return result;
    }
}
