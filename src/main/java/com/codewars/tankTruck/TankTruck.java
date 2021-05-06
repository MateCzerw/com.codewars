package com.codewars.tankTruck;

public class TankTruck {
    public static int tankVol(int h, int d, int vt) {
        double radius = (double) d / 2;
        double thickness = vt / (Math.PI * Math.pow(radius, 2));
        return (int) ((Math.pow(radius, 2) * Math.acos((radius - h) / radius) - (Math.sqrt(Math.pow(radius, 2) - Math.pow(radius - h, 2))) * (radius - h)) * thickness);
    }
}
