package com.codewars.sumOfTriangularNumbers;

import java.util.LinkedList;
import java.util.List;

public class SumOfTriangularNumbers {
    public static int sumTriangularNumbers(int n)
    {
        int previousTriangularNumber = 0;
        List<Integer> triangularNumbers = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            triangularNumbers.add(previousTriangularNumber + i);
            previousTriangularNumber += i;
        }
        return triangularNumbers.stream().mapToInt(i -> i).sum();
    }
}
