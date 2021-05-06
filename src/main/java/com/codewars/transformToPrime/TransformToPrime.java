package com.codewars.transformToPrime;

import java.util.Arrays;

public class TransformToPrime {
    public static int minimumNumber(int[] numbers)
    {
        int sum = Arrays
                .stream(numbers)
                .sum();

        return findClosestPrimeNumber(sum) - sum;
    }
    
    private static int findClosestPrimeNumber(int number){
        int primeNumberToTest = 2;
        while ((number > primeNumberToTest
                || (number == primeNumberToTest && !isPrimeNumber(primeNumberToTest))
                || (number < primeNumberToTest && !isPrimeNumber(primeNumberToTest)))){
            primeNumberToTest++;
        }
        return primeNumberToTest;
    }

    private static boolean isPrimeNumber(int primeNumberToTest) {
        for (int i = 2; i * i <= primeNumberToTest; i++) {
            if(primeNumberToTest % i == 0) return false;
        }
        return true;
    }

}
