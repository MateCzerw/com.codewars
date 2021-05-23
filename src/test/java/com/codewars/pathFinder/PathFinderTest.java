package com.codewars.pathFinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathFinderTest {

    String a = ".W.\n"+
            ".W.\n"+
            "...",

    b = ".W.\n"+
            ".W.\n"+
            "W..",

    c = "......\n"+
            "......\n"+
            "......\n"+
            "......\n"+
            "......\n"+
            "......",

    d = "......\n"+
            "......\n"+
            "......\n"+
            "......\n"+
            ".....W\n"+
            "....W.";
    @Test
    public void sampleTests1() {
        assertEquals(true,  PathFinder.pathFinder(a));
    }
    @Test
    public void sampleTests2() {
        assertEquals(false, PathFinder.pathFinder(b));
    }
    @Test
    public void sampleTests3() {
        assertEquals(true,  PathFinder.pathFinder(c));
    }
    @Test
    public void sampleTests4() {
        assertEquals(false, PathFinder.pathFinder(d));
    }
}