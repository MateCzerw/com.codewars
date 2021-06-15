package com.codewars.centerOfTheMatrix;

public class CenterOfTheMatrix {
    public static Integer center(int[][] matrix) {

        if (matrix.length % 2 == 0
                || matrix[0].length % 2 == 0
                || matrix.length == 0
                || matrix[0].length == 0) return null;

        return Integer.valueOf(matrix[(matrix.length) / 2 ][(matrix[0].length) / 2]);
    }
}
