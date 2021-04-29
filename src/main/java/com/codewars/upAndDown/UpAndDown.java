package com.codewars.upAndDown;


public class UpAndDown {

    public static String arrange(String strng) {

        String[] array = strng.split("\\s");
        for(int i = 0, l = array.length; i < l - 1; i++) {
            if((i & 1) == 0 && array[i].length() > array[i+1].length()) {
                String temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            } else if((i & 1) == 1 && array[i].length() < array[i+1].length()) {
                String temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        StringBuffer result = new StringBuffer();
        for(int i = 0, l = array.length; i < l; i++) {
            if((i & 1) == 0) {
                result.append(array[i].toLowerCase()).append(" ");
            } else {
                result.append(array[i].toUpperCase()).append(" ");
            }
        }
        return result.toString().trim();
    }

}
