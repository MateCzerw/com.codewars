package com.codewars.colorChoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColorChoiceTest {
    @Test
    public void BasicTests1() {
        System.out.println("****** Basic Tests ******");
        assertEquals(2, ColorChoice.checkchoose(6, 4));
    }    @Test
    public void BasicTests2() {
        System.out.println("****** Basic Tests ******");

        assertEquals(1, ColorChoice.checkchoose(4, 4));

    }    @Test
    public void BasicTests3() {
        System.out.println("****** Basic Tests ******");

        assertEquals(3, ColorChoice.checkchoose(35, 7));

    }    @Test
    public void BasicTests4() {

        assertEquals(-1, ColorChoice.checkchoose(4, 2));

    }    @Test
    public void BasicTests5() {
        System.out.println("****** Basic Tests ******");

        assertEquals(-1, ColorChoice.checkchoose(36, 7));
    }
}