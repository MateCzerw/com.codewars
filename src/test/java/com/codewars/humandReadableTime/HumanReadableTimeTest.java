package com.codewars.humandReadableTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanReadableTimeTest {
    @Test
    public void Tests1() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
    }
    @Test
    public void Tests2() {
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));

    }
    @Test
    public void Tests3() {

        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));

    }
    @Test
    public void Tests4() {

        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));

    }
    @Test
    public void Tests5() {

        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
    }

}