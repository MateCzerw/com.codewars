package com.codewars.pathFinder2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathFinder2Test {

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
        assertEquals(4,  PathFinder2.pathFinder(a));
    }
    @Test
    public void sampleTests2() {
        assertEquals( -1, PathFinder2.pathFinder(b));
    }
    @Test
    public void sampleTests3() {
        assertEquals( 10,  PathFinder2.pathFinder(c));
    }
    @Test
    public void sampleTests4() {
        assertEquals( -1, PathFinder2.pathFinder(d));
    }
}