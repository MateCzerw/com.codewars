package com.codewars.breakCamelCase;

public class BreakCamelCase {
    public static String camelCase(String input) {
        if(input.length() == 0) return "";
        StringBuilder sb = new StringBuilder()
                .append(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i) <= 90 && input.charAt(i - 1) >= 97) sb.append(" " + input.charAt(i));
            else sb.append(input.charAt(i));
        }
        return sb.toString();
    }
}
