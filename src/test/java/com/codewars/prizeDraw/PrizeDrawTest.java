package com.codewars.prizeDraw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrizeDrawTest {

    @Test
    public void test1() {
        String st = "";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("No participants", PrizeDraw.nthRank(st, we, 4));
    }
    @Test
    public void test2() {
        String st = "";
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("Not enough participants", PrizeDraw.nthRank(st, we, 8));
    }
    @Test
    public void test3() {
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        String st = "Addison,Jayden,Sofia,Michael,Andrew,Lily,Benjamin";
        we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        assertEquals("Benjamin", PrizeDraw.nthRank(st, we, 4));
    }
    @Test
    public void test4() {
        System.out.println("Fixed Tests");
        Integer[] we = new Integer[] {4, 2, 1, 4, 3, 1, 2};
        String st = "Elijah,Chloe,Elizabeth,Matthew,Natalie,Jayden";
        we = new Integer[] {1, 3, 5, 5, 3, 6};
        assertEquals("Matthew", PrizeDraw.nthRank(st, we, 2));
    }

    @Test
    public void test5() {
        System.out.println("Fixed Tests");
        String st = "BB,AAAA";
        Integer[] we = new Integer[] {1, 1};
        assertEquals("AAAA", PrizeDraw.nthRank(st, we, 1));
    }
}