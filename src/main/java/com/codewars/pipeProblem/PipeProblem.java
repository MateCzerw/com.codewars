package com.codewars.pipeProblem;

class PipeProblem {
    static int[] pipeFix(int[] numbers) {
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        int[] fixedList = new int[max - min + 1];

        for (int i = 0; i <= max - min; i++) {
            fixedList[i] = min + i;
        }
        return fixedList;
    }
}
