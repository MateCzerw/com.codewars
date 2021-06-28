package com.codewars.seasons;

import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        Solution test = new Solution();
        test.solution(new int[]{
                -3,-14,-5,7,8,42,8,3
        });
    }

    public String solution(int[] temperatureInEachDay) {
        int n = temperatureInEachDay.length;
        String result = "WINTER";
        int maxAmplitude;

        int amplitudeInWinter =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay , 0, n /4 );
        maxAmplitude = amplitudeInWinter;
        int amplitudeInSpring =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay , n / 4, 2 * n /4 );
        maxAmplitude = maxAmplitude < amplitudeInSpring
                ? amplitudeInSpring
                : maxAmplitude;
        if(maxAmplitude == amplitudeInSpring) result = "SPRING";
        int amplitudeInSummer =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay , 2 * n /4, 3 * n /4 );
        maxAmplitude = maxAmplitude < amplitudeInSummer
                ? amplitudeInSummer
                : maxAmplitude;
        if(maxAmplitude == amplitudeInSummer) result = "SUMMER";
        int amplitudeInAutumn =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay , 3 * n /4, n );
        maxAmplitude = maxAmplitude < amplitudeInAutumn
                ? amplitudeInAutumn
                : maxAmplitude;
        if(maxAmplitude == amplitudeInAutumn) result = "AUTUMN";


        return result;
    }

    private int calculateAmplitudeOfTemperatureInSeason(int[] temperatureInEachDay,
                                                        int start,
                                                        int end){
        int minTemperature = IntStream.range(start,end)
                .map(i -> temperatureInEachDay[i])
                .min()
                .orElseThrow(() ->  new IllegalArgumentException());

        int maxTemperature = IntStream.range(start,end)
                .map(i -> temperatureInEachDay[i])
                .max()
                .orElseThrow(() ->  new IllegalArgumentException());
        return  maxTemperature - minTemperature;
    }
}
