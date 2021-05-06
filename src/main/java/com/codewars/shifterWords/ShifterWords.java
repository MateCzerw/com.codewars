package com.codewars.shifterWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShifterWords {
    public static int count(String st){
        String shifterLetters = "[HINOSXZMW]";
        String[] words = st.split("\\s+");

        if(words.length == 1 && words[0].equals("")) return 0;

        return (int) Arrays.stream(words)
                .distinct()
                .map(word -> word.replaceAll(shifterLetters, ""))
                .filter(word -> word.length() == 0)
                .count();
    }
}
