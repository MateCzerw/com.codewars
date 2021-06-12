package com.codewars.findTheSquares;

public class FindTheSquares {
    public static String findSquares(int n){
        long squaredMin = 0;
        long squaredMax = 1L;
        while (squaredMax * squaredMax - squaredMin * squaredMin != n){
            squaredMin = squaredMax;
            squaredMax++;
        }
        return squaredMax * squaredMax + "-" + squaredMin * squaredMin;
    }
}
