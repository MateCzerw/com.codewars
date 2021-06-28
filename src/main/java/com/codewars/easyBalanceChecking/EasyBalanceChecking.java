package com.codewars.easyBalanceChecking;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EasyBalanceChecking {

    public static String balance(String book) {
        String cleanedBook = book.replaceAll("[^a-zA-Z0-9. \n]+", "");
        String[] lines = cleanedBook.split("\n");
        double initialBalance = Double.parseDouble(lines[0]);
        double balance = initialBalance;
        lines[0] = lines[0].trim();
        lines[0] = "Original Balance: " + lines[0];


        for (int i = 1; i < lines.length; i++) {
            lines[i] = lines[i].trim();
            lines[i] = Arrays.stream(lines[i].split(" "))
                    .filter(e -> !e.equals(""))
                    .collect(Collectors.joining(" "));
            double costOfProduct =
                    Double.parseDouble(lines[i]
                            .substring(lines[i]
                                    .lastIndexOf(" ")));
            balance -= costOfProduct;
            lines[i] = lines[i] + " Balance " + String.format("%.2f", balance);
        }

        String result = Arrays.stream(lines)
                .collect(Collectors.joining("\\r\\n")) + "\\r\\n";

        result = result + "Total expense  " + String.format("%.2f", initialBalance - balance) + "\\r\\n";
        result = result + "Average expense  " + String.format("%.2f", (initialBalance - balance) / (lines.length - 1));

        return result.replaceAll("[,]", ".");
    }
}
