package com.codewars.switcheroo;

import java.util.stream.Collectors;

public class Switcheroo {
    public static String switcheroo(String x) {
        return x.chars()
                .map(e -> {
                    switch (e) {
                        case 97:
                            return 98;
                        case 98:
                            return 97;
                        default:
                            return e;
                    }
                })
                .mapToObj(e -> (char) e)
                .map(e -> Character.toString(e))
                .collect(Collectors.joining());

    }
}
