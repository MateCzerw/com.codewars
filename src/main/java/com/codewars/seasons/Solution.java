package com.codewars.seasons;

import java.util.stream.IntStream;

public class Solution {



    public String solution(int[] temperatureInEachDay) {
        int n = temperatureInEachDay.length;
        String result = "WINTER";
        int maxAmplitude;

        int amplitudeInWinter =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay, 0, n / 4);
        maxAmplitude = amplitudeInWinter;
        int amplitudeInSpring =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay, n / 4, 2 * n / 4);
        maxAmplitude = maxAmplitude < amplitudeInSpring
                ? amplitudeInSpring
                : maxAmplitude;
        result = maxAmplitude == amplitudeInSpring
                ? "SPRING"
                : result;
        int amplitudeInSummer =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay, 2 * n / 4, 3 * n / 4);
        maxAmplitude = maxAmplitude < amplitudeInSummer
                ? amplitudeInSummer
                : maxAmplitude;
        if (maxAmplitude == amplitudeInSummer) result = "SUMMER";
        int amplitudeInAutumn =
                calculateAmplitudeOfTemperatureInSeason(temperatureInEachDay, 3 * n / 4, n);
        maxAmplitude = maxAmplitude < amplitudeInAutumn
                ? amplitudeInAutumn
                : maxAmplitude;
        if (maxAmplitude == amplitudeInAutumn) result = "AUTUMN";


        return result;
    }

    private int calculateAmplitudeOfTemperatureInSeason(int[] temperatureInEachDay,
                                                        int start,
                                                        int end) {
        int minTemperature = IntStream.range(start, end)
                .map(i -> temperatureInEachDay[i])
                .min()
                .orElseThrow(() -> new IllegalArgumentException());

        int maxTemperature = IntStream.range(start, end)
                .map(i -> temperatureInEachDay[i])
                .max()
                .orElseThrow(() -> new IllegalArgumentException());
        return maxTemperature - minTemperature;
    }
}
