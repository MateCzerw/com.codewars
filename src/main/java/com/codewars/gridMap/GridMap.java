package com.codewars.gridMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GridMap {

    public static <T,R> Object[][] gridMap(Function<T,R> fn, T[][] list){

        return Arrays.stream(list).map(xs -> Arrays.stream(xs).map(fn).toArray()).toArray(Object[][]::new);
    }
}
