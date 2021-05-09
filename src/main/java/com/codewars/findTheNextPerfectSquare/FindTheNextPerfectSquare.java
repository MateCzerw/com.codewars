package com.codewars.findTheNextPerfectSquare;

public class FindTheNextPerfectSquare {
    public static long findNextSquare(long number) {
        long squareOfNumber = 1;

        for (long i = 1; i * i < number; i++) {
            squareOfNumber++;
        }

        // check if sq is perfect square
        if(squareOfNumber * squareOfNumber != number) return -1;

        do {
            squareOfNumber++;
        }
        while (squareOfNumber * squareOfNumber < number);

        return squareOfNumber * squareOfNumber;
    }



}
