package com.codewars.upAndDown;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UpAndDownTest {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests arrange");

        testing(UpAndDown.arrange("who hit retaining The That a we taken"),
                "who RETAINING hit THAT a THE we TAKEN"); // 3
        testing(UpAndDown.arrange("on I came up were so grandmothers"),
                "i CAME on WERE up GRANDMOTHERS so"); // 4
        testing(UpAndDown.arrange("way the my wall them him"),
                "way THE my WALL him THEM"); // 1
        testing(UpAndDown.arrange("turn know great-aunts aunt look A to back"),
                "turn GREAT-AUNTS know AUNT a LOOK to BACK"); // 2

    }
}