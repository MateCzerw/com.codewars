package com.codewars.pathFinder3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathFinder3Test {

    String a = "000\n" +
            "000\n" +
            "000",

    b = "010\n" +
            "010\n" +
            "010",

    c = "010\n" +
            "101\n" +
            "010",

    d = "0707\n" +
            "7070\n" +
            "0707\n" +
            "7070",

    e = "700000\n" +
            "077770\n" +
            "077770\n" +
            "077770\n" +
            "077770\n" +
            "000007",

    f = "777000\n" +
            "007000\n" +
            "007000\n" +
            "007000\n" +
            "007000\n" +
            "007777",

    g = "000000\n" +
            "000000\n" +
            "000000\n" +
            "000010\n" +
            "000109\n" +
            "001010";

    @Test
    public void sampleTests1() { assertEquals(0, PathFinder3.pathFinder(a)); }

    @Test
    public void sampleTests2() { assertEquals(2, PathFinder3.pathFinder(b)); }

    @Test
    public void sampleTests3() {
        assertEquals(4, PathFinder3.pathFinder(c));
    }

    @Test
    public void sampleTests4() {
        assertEquals(42, PathFinder3.pathFinder(d));
    }

    @Test
    public void sampleTests5() {
        assertEquals(14, PathFinder3.pathFinder(e));
    }

    @Test
    public void sampleTests6() {
        assertEquals(0, PathFinder3.pathFinder(f));
    }

    @Test
    public void sampleTests7() {
        assertEquals(4, PathFinder3.pathFinder(g));
    }
}