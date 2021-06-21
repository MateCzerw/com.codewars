package com.codewars.compareWithinMargin;

public class Solution {
    public static int closeCompare(double a, double b, double margin){
        if( Math.abs(a - b) <= margin ) return 0;
        return a > b ? 1 : -1;
    }

    public static int closeCompare(double a, double b){
        return closeCompare(a,b,0);
    }
}
