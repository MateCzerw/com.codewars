package com.codewars.colorChoice;

public class ColorChoice {
    public static long checkchoose(long m, int n) {
        long c = 1;
        for(int l = 1; l <= n; l++) {
            c = c * (n-l + 1)/l;
            if(c == m) return l;
        }
        return -1;
    }

}
