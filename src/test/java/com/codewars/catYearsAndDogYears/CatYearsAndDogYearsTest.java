package com.codewars.catYearsAndDogYears;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatYearsAndDogYearsTest {
    @Test
    public void one() {
        assertArrayEquals(new int[]{1,15,15}, CatYearsAndDogYears.humanYearsCatYearsDogYears(1));
    }

    @Test
    public void two() {
        assertArrayEquals(new int[]{2,24,24}, CatYearsAndDogYears.humanYearsCatYearsDogYears(2));
    }

    @Test
    public void ten() {
        assertArrayEquals(new int[]{10,56,64}, CatYearsAndDogYears.humanYearsCatYearsDogYears(10));
    }

}