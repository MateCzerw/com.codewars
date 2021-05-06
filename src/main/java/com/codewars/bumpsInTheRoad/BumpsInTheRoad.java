package com.codewars.bumpsInTheRoad;

public class BumpsInTheRoad {
    public static String bumps(final String road) {
        long result = road.chars()
                .mapToObj(c -> (char) c)
                .filter(letter -> letter == 'n')
                .count();
        return result > 15 ? "Car Dead" : "Woohoo!";
    }
}
