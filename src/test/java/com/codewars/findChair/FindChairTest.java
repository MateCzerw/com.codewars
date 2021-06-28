package com.codewars.findChair;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindChairTest {
    @Test
    public void basic1() {
        Room[] rooms = new Room[] {
                new Room("XXX", 3),
                new Room("XXXXX", 6),
                new Room("XXXXXX", 9)
        };
        assertArrayEquals(new int[] {0, 1, 3}, (int[]) FindChair.meeting(rooms, 4));
    }

    @Test
    public void basic2() {
        Room[] rooms = new Room[] {
                new Room("XXX", 1),
                new Room("XXXXXX", 6),
                new Room("X", 2),
                new Room("XXXXXX", 8),
                new Room("X", 3),
                new Room("XXX", 1)
        };
        assertArrayEquals(new int[] {0, 0, 1, 2, 2}, (int[]) FindChair.meeting(rooms, 5));
    }

    @Test
    public void basic3() {
        Room[] rooms = new Room[] {
                new Room("XX", 2),
                new Room("XXXX", 6),
                new Room("XXXXX", 4)
        };
        assertEquals("Game On", FindChair.meeting(rooms, 0));
    }
}