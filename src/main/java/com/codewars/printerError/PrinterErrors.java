package com.codewars.printerError;

public class PrinterErrors {
    public static String printerError(String s) {
        long correctNumbers = s.chars()
                .filter(c -> (c < 97 || c > 109))
                .count();
        return String.format("%d/%d", correctNumbers, s.length());
    }
}
