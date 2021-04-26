package com.codewars.gcd;

import java.math.BigInteger;

public class GCD {

    public static int compute(int x, int y) {

        return calculateGCD( x, y);
    }

    public static int calculateGCD(int a, int b){

        if(a == 0) return b;
        if(b == 0) return a;
        int q = 0;
//        long result = (long)b  * (long)(q + 1);
        long result = Long.valueOf(b) * Long.valueOf((q+1));
        while(result <= a){
            q++;
            result = Long.valueOf(b) * Long.valueOf((q+1));
        }
        return calculateGCD(b, a - q * b);
    }

}
