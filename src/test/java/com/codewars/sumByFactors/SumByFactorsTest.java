package com.codewars.sumByFactors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumByFactorsTest {
    @Test
    public void test1() {
        int[] lst = new int[] {12, 15};
        assertEquals("(2 12)(3 27)(5 15)", SumByFactors.sumOfDivided(lst));
    }

    @Test
    public void test2() {
        int[] lst = new int[] {107, 158, 204, 100, 118, 123, 126, 110, 116, 100};
        assertEquals("(2 1032)(3 453)(5 310)(7 126)(11 110)(17 204)(29 116)(41 123)(59 118)(79 158)(107 107)", SumByFactors.sumOfDivided(lst));
    }
    @Test
    public void test3() {
        int[] lst = new int[] {461, 96, -97, 143, 301, 113, 278, 301, 98, 324, -95, 100, 394, 96, -19, -64, 149, 5, 414, 265, 228};
        assertEquals("(2 1964)(3 1158)(5 275)(7 700)(11 143)(13 143)(19 114)(23 414)(43 602)(53 265)(97 -97)(113 113)(139 278)(149 149)(197 394)(461 461)", SumByFactors.sumOfDivided(lst));
    }
}