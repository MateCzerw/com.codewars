package com.codewars.onesAndZeros;

import java.util.List;

public class OnesAndZeros {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int result = 0;
        for (int i = 0; i < binary.size(); i++) {
            result += binary.get(i) * Math.pow(2, binary.size() - 1 - i);
        }
        return result;
    }
}
