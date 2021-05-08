package com.codewars.bonuses;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BonusTest {

    @Test
    public void test1() {
        assertArrayEquals(new long[] {1860, 13640, 2728},  Bonus.bonus(new int[] {22, 3, 15}, 18228));
    }
    @Test
    public void test2() {
        assertArrayEquals(new long[] {10241, 5852, 7448}, Bonus.bonus(new int[] {8, 14, 11}, 23541));
    }
    @Test
    public void test3() {
        assertArrayEquals(new long[] {13515, 5406, 6360}, Bonus.bonus(new int[] {8, 20, 17}, 25281));
    }
    @Test
    public void test4() {
        assertArrayEquals(new long[] {13340, 5336, 3480}, Bonus.bonus(new int[] {6, 15, 23}, 22156));
    }
    @Test
    public void test5() {
        assertArrayEquals(new long[] {4608, 3584, 2688}, Bonus.bonus(new int[] {7, 9, 12}, 10880));
    }
}