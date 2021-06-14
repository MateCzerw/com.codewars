package com.codewars.hiddenCubicNumbers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HiddenCubicNumbers {

    public String isSumOfCubes(String s) {

        s = s.replaceAll("[^0-9]"," ");
        String numbers = Arrays
                .stream(s.split(" "))
                .map(number -> {
                    if (number.length() > 3) {
                        StringBuilder sb = new StringBuilder();
                        for (int start = 0; start < number.length(); start += 3) {
                            sb.append(number, start, Math.min(number.length(), start + 3));
                            sb.append(" ");
                        }
                        return sb.toString();
                    }
                    return number;
                })
                .collect(Collectors.joining(" "));

        String[] cubicNumbers = Arrays
                .stream(numbers.split(" "))
                .filter(e -> !e.equals(""))
                .filter(number -> isCubicNumber(number))
                .toArray(String[]::new);

        String result = Arrays.stream(cubicNumbers)
                .collect(Collectors.joining(" "));

        result = result + " " +
                Arrays
                .stream(cubicNumbers)
                .mapToInt(Integer::parseInt)
                .sum();

        result += " Lucky";

        return cubicNumbers.length != 0 ? result : "Unlucky";
    }

    private boolean isCubicNumber(String number){
        int sum = number.chars()
                .mapToObj(c -> (char) c)
                .map(c -> Integer.parseInt(String.valueOf(c)))
                .mapToInt(digital -> (int)(Math.pow(digital,3D)))
                .sum();
        return sum == Long.parseLong(number);
    }

}
