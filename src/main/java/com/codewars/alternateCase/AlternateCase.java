package com.codewars.alternateCase;

import java.util.stream.Collectors;

public class AlternateCase {
    static String alternateCase(final String string) {
        return string.chars()
                .map(c ->
                {
                    if(c >= 97 && c <= 122) return c - 32;
                    if(c >= 65 && c <= 90) return c + 32;
                    return c;
                })
                .mapToObj(c -> (char) c)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
