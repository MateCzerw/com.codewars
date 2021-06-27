package com.codewars.testtest;

import java.util.*;
import java.util.stream.Collectors;

public class TestGenerator {
    public static String solution(String employees, String companyName) {
        Map<String, Integer> mailsAndQuantity = new HashMap<>();
        String[] employeesNames = employees.split("; ");
        List<String> mails = Arrays.stream(employeesNames)
                .map(e -> e.toLowerCase())
                .map(e -> {
                    String[] namesAndSurname = e.split(" ");
                    return namesAndSurname.length == 3
                            ? namesAndSurname[0] + "_" + namesAndSurname[2]
                            : namesAndSurname[0] + "_" + namesAndSurname[1];
                })
                .map(e -> {
                    String[] namesAndSurname = e.split("_");
                    return namesAndSurname[1].contains("-")
                            ? namesAndSurname[1].replaceAll("-", "") + "_" + namesAndSurname[0]
                            : namesAndSurname[1] + "_" + namesAndSurname[0];
                })
                .map(e -> e + "@" + companyName.toLowerCase() + ".com")
                .map(e -> {
                    if (!mailsAndQuantity.containsKey(e.substring(0, e.indexOf("@")))) {
                        mailsAndQuantity.put(e.substring(0, e.indexOf("@")), 1);
                        return e;
                    } else {
                        int lastNumber = mailsAndQuantity.get(e.substring(0, e.indexOf("@")));
                        mailsAndQuantity.put(e.substring(0, e.indexOf("@")), lastNumber + 1);
                        return e.substring(0, e.indexOf("@")) + (lastNumber + 1) + e.substring(e.indexOf("@"));
                    }
                })
                .map(e -> "<" + e + ">")
                .collect(Collectors.toList());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < employeesNames.length; i++) {
            sb.append(employeesNames[i] + " " + mails.get(i) + "; ");
        }

        return sb.toString().substring(0, sb.toString().length() - 2);
    }



}
