package com.codewars.walker;

public class Walker {
    public static int[] solve(int a, int b, int c, int alpha, int beta, int gamma) {
        double x = a * Math.cos(Math.toRadians(alpha)) - b * Math.sin(Math.toRadians(beta)) - c * Math.cos(Math.toRadians(gamma));
        double y = a * Math.sin(Math.toRadians(alpha)) + b * Math.cos(Math.toRadians(beta)) - c * Math.sin(Math.toRadians(gamma));
        int oc = (int) Math.round(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));

        double angle = Math.PI / 2 + Math.atan(-x / y);
        int totalSeconds = (int)(angle * 360 * 60 * 60 / (2 * Math.PI));
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds / 60) % 60;
        int degrees = totalSeconds / (60 * 60);
        return new int[]{
                oc,degrees,minutes,seconds
        };
    }
}
