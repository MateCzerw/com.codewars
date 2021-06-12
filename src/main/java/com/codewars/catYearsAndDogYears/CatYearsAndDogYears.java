package com.codewars.catYearsAndDogYears;

public class CatYearsAndDogYears {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        switch (humanYears){
            case 1: return new int[]{1,15,15};
            case 2: return new int[]{2,24,24};
            default: return new int[]{humanYears,24 + (humanYears - 2) * 4,24 + (humanYears - 2) * 5};
        }
    }
}
