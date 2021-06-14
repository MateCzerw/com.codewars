package com.codewars.playingWithPassphrasses;

import java.util.stream.Collectors;

class PlayingWithPassphrasses {
    public static String playPass(String word, int n) {
        String wordAfterStep1and3 =
                word
                        .chars()
                        //shift letter without circular change
                        .map(letter ->
                        {
                            if (letter >= 65 && letter <= 90 && letter + n <= 90) return letter + n;
                            else if (letter >= 65 && letter <= 90 && letter + n > 90) return (letter + n - 90) + 64;
                            else return letter;

                        })
                        //replace each digit by its complement to 9
                        .map(letter -> letter >= 48 && letter <= 57 ? 57 - letter + 48 : letter)
                        .mapToObj(c -> (char) c)
                        .map(c -> c.toString())
                        .collect(Collectors.joining());

        StringBuilder sb = new StringBuilder(wordAfterStep1and3);

        for (int i = 0; i < wordAfterStep1and3.length(); i++) {
            if (wordAfterStep1and3.charAt(i) >= 65
                    && wordAfterStep1and3.charAt(i) <= 108
                    && i % 2 == 1) sb.setCharAt(i, (char) (wordAfterStep1and3.charAt(i) + 32));
            else sb.setCharAt(i, (wordAfterStep1and3.charAt(i)));
        }
        return sb.reverse().toString();
    }
}
