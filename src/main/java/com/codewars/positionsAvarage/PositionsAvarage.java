package com.codewars.positionsAvarage;

public class PositionsAvarage {
    public static double posAverage(String s) {
        String[] numbers = s.split(", ");
        int wordLength = numbers[0].length();
        int totalNumberOfPositions = numbers[0].length() * (numbers.length * (numbers.length - 1)) / 2;
        int commonLetters = 0;
        for (int i = 0; i < wordLength ; i++) {
            int common0 = 0;
            int common4 = 0;
            int common6 = 0;
            int common9 = 0;

            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j].charAt(i)  == '0') common0++;
                if(numbers[j].charAt(i)  == '4') common4++;
                if(numbers[j].charAt(i)  == '6') common6++;
                if(numbers[j].charAt(i)  == '9') common9++;
            }
            if(common0 > 1) commonLetters += (common0 * (common0 - 1)) / 2;
            if(common4 > 1) commonLetters += (common4 * (common4 - 1)) / 2;
            if(common6 > 1) commonLetters += (common6 * (common6 - 1)) / 2;
            if(common9 > 1) commonLetters += (common9 * (common9 - 1)) / 2;
        }
        return (double)commonLetters / (double)totalNumberOfPositions * 100;
    }



}
