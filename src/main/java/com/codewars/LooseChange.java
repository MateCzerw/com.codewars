package com.codewars;

import java.util.HashMap;

public class LooseChange {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        if(cent <= 0){
            map.put("Pennies", 0);
            map.put("Nickels", 0);
            map.put("Dimes", 0);
            map.put("Quarters", 0);
            return  map;
        }
        map.put("Quarters", cent / 25);
        cent -= cent / 25 * 25;
        map.put("Dimes", cent / 10);
        cent -= cent / 10 * 10;
        map.put("Nickels", cent / 5);
        cent -= cent / 5 * 5;
        map.put("Pennies", cent);
        return map;
    }
}
