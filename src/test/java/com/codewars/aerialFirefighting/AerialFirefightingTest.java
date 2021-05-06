package com.codewars.aerialFirefighting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AerialFirefightingTest {
    @Test
    public void basicTests(){
        assertEquals(3, AerialFirefighting.waterbombs("xxxxYxYx", 4));
        assertEquals(2, AerialFirefighting.waterbombs("xxYxx", 3));
    }
}