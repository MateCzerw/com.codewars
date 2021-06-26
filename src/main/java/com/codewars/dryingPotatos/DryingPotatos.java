package com.codewars.dryingPotatos;

public class DryingPotatos {
    public static int potatoes(int p0, int w0, int p1) {
        double weightOfDryPotato = (double) w0 * (100 - p0) / 100;
        return (int) Math.floor(weightOfDryPotato * (100d / (100 - p1)));
    }
}
