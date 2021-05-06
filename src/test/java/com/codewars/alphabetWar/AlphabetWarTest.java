package com.codewars.alphabetWar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlphabetWarTest {
    @Test
    public void BasicTest1() {
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("ps"));
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("vzp"));
    }
    @Test
    public void BasicTest2() {
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("ps"));
    }
    @Test
    public void BasicTest3() {
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("vzp"));
    }
}