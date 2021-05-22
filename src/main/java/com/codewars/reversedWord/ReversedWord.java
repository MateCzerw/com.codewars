package com.codewars.reversedWord;


public class ReversedWord {
    public static String reverseWords(String str){
        String[] words = str.split(" ");
        StringBuilder sb= new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }
        return sb.toString().trim();
    }

}
