package com.codewars.growthOfPopulation;

public class GrowthOfPopulation {
    public static int nbYear(int populationStart, double percent, int populationMovedToTown, int populationEnd) {
        int population = populationStart;
        int year = 0;
        while (population < populationEnd){
            population = population + (int)(population * (percent / 100)) + populationMovedToTown;
            year++;
        }
        return year;
    }
}
