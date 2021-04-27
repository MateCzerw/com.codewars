package com.codewars.harvestFestiva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarvestFestivalTest {
    @Test
    public void sampleTests1() {
        assertEquals("---,,,,,,,---,,,,,,,---,,,,,,,", HarvestFestival.plant(',', 3, 7, 25));
    }
    @Test
    public void sampleTests2() {
        assertEquals("-+", HarvestFestival.plant('+', 1, 3, 15));
    }
    @Test
    public void sampleTests3() {
        assertEquals("---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;", HarvestFestival.plant(';', 9, 10, 30));
    }
}