package com.codewars.growthOfPopulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrowthOfPopulationTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        testing(GrowthOfPopulation.nbYear(1500, 5, 100, 5000),15);
    }
    @Test
    public void test2() {
        testing(GrowthOfPopulation.nbYear(1500000, 2.5, 10000, 2000000), 10);
    }
    @Test
    public void test3() {
        testing(GrowthOfPopulation.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}