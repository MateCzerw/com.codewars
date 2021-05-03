package com.codewars.shorterPath;


public class ShortestPath {
    public static String[] directions(String[] goal) {
        int vertical = 0;
        int horizontal = 0;

        for (String path : goal) {
            if (path.equals("N")) vertical++;
            if (path.equals("E") ) horizontal++;
            if (path.equals("S")) vertical--;
            if (path.equals("W") ) horizontal--;
        }

        String[] result = new String[Math.abs(vertical) + Math.abs(horizontal)];
            for (int i = 0; i < Math.abs(vertical); i++) {
                if(vertical > 0) result[i] = "N";
                if(vertical < 0) result[i] = "S";
            }

        for (int i = Math.abs(vertical); i < Math.abs(vertical) + Math.abs(horizontal); i++) {
            if(horizontal > 0) result[i] = "E";
            if(horizontal < 0) result[i] = "W";
        }

        if(horizontal == 0 & vertical == 0) return new String[] {""};
        return result;
    }
}