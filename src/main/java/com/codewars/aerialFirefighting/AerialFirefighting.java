package com.codewars.aerialFirefighting;

import java.util.Arrays;

public class AerialFirefighting {
    public static int waterbombs(String fire, int w){

        String[] fireFields = fire.split("[Y]");

        return Arrays
                .stream(fireFields)
                .map(e -> (int) Math.ceil((double) e.length() / w))
                .reduce(0, (a, b) -> a + b);
    }
}
