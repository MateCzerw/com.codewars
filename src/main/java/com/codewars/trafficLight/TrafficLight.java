package com.codewars.trafficLight;

public class TrafficLight {
    public static String updateLight(String current) {
        switch(current){
            case "green" : return  "yellow";
            case "yellow" : return  "red";
            case "red" : return  "green";
            default: throw new RuntimeException("Wring input data");
        }
    }
}
