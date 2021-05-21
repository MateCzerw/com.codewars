package com.codewars.threadedCounting;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class ThreadedCountingTest {
//    @Test
//    public void the_correct_numbers_are_counted() throws InterruptedException {
//        Counter counter = new Counter();
//        ThreadedCounting.countInThreads(counter);
//
//        Set<Integer> expected = IntStream.rangeClosed(1, 100)
//                .boxed()
//                .collect(Collectors.toSet());
//        Set<Integer> actual = new HashSet<>(counter.getNumbers());
//
//        assertEquals(
//                expected, actual);
//    }
//
//    @Test
//    public void the_correct_numbers_are_counted_in_sequence() throws InterruptedException {
//        Counter counter = new Counter();
//        ThreadedCounting.countInThreads(counter);
//
//        List<Integer> expected = IntStream.rangeClosed(1, 100)
//                .boxed()
//                .collect(Collectors.toList());
//        List<Integer> actual = counter.getNumbers();
//
//        assertEquals(
//                expected, actual);
//    }
//
//    @Test
//    public void three_threads_are_used() throws InterruptedException {
//        Counter counter = new Counter();
//        ThreadedCounting.countInThreads(counter);
//
//        assertEquals(
//                3, counter.getThreadIds().size());
//    }
//
//    @Test
//    public void numbers_are_in_the_correct_threads() throws InterruptedException {
//        Counter counter = new Counter();
//        ThreadedCounting.countInThreads(counter);
//
//        List<Integer> expected1 = IntStream.rangeClosed(1, 100)
//                .filter(i -> i % 3 == 1)
//                .boxed()
//                .collect(Collectors.toList());
//        List<Integer> expected2 = IntStream.rangeClosed(1, 100)
//                .filter(i -> i % 3 == 2)
//                .boxed()
//                .collect(Collectors.toList());
//        List<Integer> expected3 = IntStream.rangeClosed(1, 100)
//                .filter(i -> i % 3 == 0)
//                .boxed()
//                .collect(Collectors.toList());
//
//        assertEquals(
//                expected1, counter.getNumbersInSameThreadAs(1));
//        assertEquals(
//                expected2, counter.getNumbersInSameThreadAs(2));
//        assertEquals(
//                expected3, counter.getNumbersInSameThreadAs(3));
//    }
}