package com.codewars.matchingAndSubstituing;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MatchingAndSubstituing {
    public static String change(String data, String prog, String version) {

        String phoneNumber = Arrays.stream(data.split("\n"))
                .filter(word -> word.contains("Phone:"))
                .reduce((u, v) -> { throw new IllegalStateException("More than one element found");}).get();
        String versionFromData = Arrays.stream(data.split("\n"))
                .filter(word -> word.contains("Version:"))
                .reduce((u, v) -> { throw new IllegalStateException("More than one element found");}).get();

        Pattern patternForNumber = Pattern.compile("^\\+1-\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d$");
        if(!patternForNumber.matcher(phoneNumber.substring(7)).matches()) return "ERROR: VERSION or PHONE";
        Pattern patternForVersion = Pattern.compile("^(\\d+)\\.(\\d+)$");
        if(!patternForVersion.matcher(versionFromData.substring(9)).matches()) return "ERROR: VERSION or PHONE";



        return Arrays.stream(data.split("\n"))
                .filter(word -> !word.contains("Corporation:"))
                .filter(word -> !word.contains("Level:"))
                .map(row -> {
                    if (row.contains("Program title:")) return row.substring(0, 7) + ": " + prog;
                    else return row;
                })
                .map(row -> {
                    if (row.contains("Date:")) return row.substring(0, 6) + "2019-01-01";
                    else return row;
                })
                .map(row -> {
                    if (row.contains("Author:")) return row.substring(0, 8) + "g964";
                    else return row;
                })
                .map(row -> {
                    if (row.contains("Phone:")) return row.substring(0, 7) + "+1-503-555-0090";
                    else return row;
                })
                .map(row -> {
                    if (row.contains("Version:") && !row.equals("Version: 2.0")) return row.substring(0, 9) + version;
                    else return row;
                })
                .collect(Collectors.joining(" "));
    }
}
