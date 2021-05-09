package com.codewars.multipicationTableForNumber;

public class MultiplicationTableForNumber {
    public static String multiTable(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(String.format("%d * %d = %d\n", i, num, i * num));
        }
        return sb.toString().substring(0, sb.length() - 1);
    }
}
