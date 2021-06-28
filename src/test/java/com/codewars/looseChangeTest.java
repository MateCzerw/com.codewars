package com.codewars;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class looseChangeTest {
    @Test
    public void sampleTest() {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 4);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 1);
        assertEquals(map, LooseChange.looseChange(29));

        map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        assertEquals(map, LooseChange.looseChange(0));

        map = new HashMap<>();
        map.put("Pennies", 1);
        map.put("Nickels", 1);
        map.put("Dimes", 1);
        map.put("Quarters", 3);
        assertEquals(map, LooseChange.looseChange(91));

        map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);
        assertEquals(map, LooseChange.looseChange(-2));
    }
}