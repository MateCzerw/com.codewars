package com.codewars.humandReadableTime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {


        int sec = seconds % 60;
        int min = seconds % 3600 / 60;
        int hours = seconds / 3600;



        return String
                .format("%s:%s:%s"
                        ,hours <= 9 ? "0" + hours : hours
                        ,min <= 9 ? "0" + min : min
                        ,sec <= 9 ? "0" + sec : sec);
    }
}
