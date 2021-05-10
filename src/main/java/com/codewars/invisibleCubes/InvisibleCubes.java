package com.codewars.invisibleCubes;

public class InvisibleCubes {
    public Long notVisibleCubes(Long n) {
        return n > 2 ? (long) Math.pow(n - 2, 3) : 0L;
    }
}
