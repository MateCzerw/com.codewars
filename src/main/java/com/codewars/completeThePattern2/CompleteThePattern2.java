package com.codewars.completeThePattern2;

public class CompleteThePattern2 {
    public static String pattern ( int n) {
        String result = "";
        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = n; j >= i; j--) {
                line += j;
            }

            if(n == i) result += line;
            else result += line + "\n";
        }
        return result;
    }
}
