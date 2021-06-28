package com.codewars;

public class TortoiseRacing {
    public static int[] race(int v1, int v2, int g) {
        if(v1 >= v2) return null;
        int totalSeconds = (int)((double) g / (v2 - v1) * 3600);
        int hours = totalSeconds / 3600;
        totalSeconds -= hours * 3600;
        int minutes = totalSeconds / 60;
        totalSeconds -= minutes * 60;
        int seconds = totalSeconds;
        return new int[]{hours,minutes,seconds};
    }
}
