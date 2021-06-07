package com.codewars.powerOfI;

public class PowerOfI {

    public static String pofi(int n) {

        int  variant = n % 4;

        switch (variant){
            case 0:
                return "1";
            case 1:
                return "i";
            case 2:
                return "-1";
            case 3:
                return "-i";
            default: throw new RuntimeException();
        }

    }
}
