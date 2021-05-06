package com.codewars.alphabetWar;

import java.util.HashMap;
import java.util.Map;

public class AlphabetWar {
    public static String alphabetWar(String fight){
        Map<Character,Integer> map = new HashMap<>();
        map.put('w',4);
        map.put('p',3);
        map.put('b',2);
        map.put('s',1);
        map.put('m',-4);
        map.put('q',-3);
        map.put('d',-2);
        map.put('z',-1);

        int result = 0;

        for (int i = 0; i < fight.length(); i++) {
            if(!map.containsKey(fight.charAt(i))) continue;
            result = result + map.get(fight.charAt(i));
        }

        if(result == 0) return "Let's fight again!";
        return result > 0 ? "Left side wins!" : "Right side wins!";
    }
}
