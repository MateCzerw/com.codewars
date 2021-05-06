package com.codewars.shorterPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestPathTest {
    @Test
    public void Tests1() {
        String[] goal1 = {"N","N","N","N","N","E","N","N"};
        assertArrayEquals(new String[] {"N","N","N","N","N","N","N","E"}, ShortestPath.directions(goal1));
    }
    @Test
    public void Tests2() {

        String[] goal2 = {"S","S","N","E","W","S","N"};
        assertArrayEquals(new String[] {"S"}, ShortestPath.directions(goal2));

    }
    @Test
    public void Tests3() {

        String[] goal3 = {"N","W","S","E"};
        assertArrayEquals(new String[] {""}, ShortestPath.directions(goal3));
    }
}