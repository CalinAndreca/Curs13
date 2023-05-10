package org.fasttrackit.curs15.homework15;

import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class RecursiveMethodsTest {

    @Test
    public void testSumOfFirstNIntegers(){
        assertEquals(0, RecursiveMethods.sumOfFirstNIntegers(0));
        assertEquals(1, RecursiveMethods.sumOfFirstNIntegers(1));
        assertEquals(3, RecursiveMethods.sumOfFirstNIntegers(2));
        assertEquals(10, RecursiveMethods.sumOfFirstNIntegers(4));
        assertEquals(55, RecursiveMethods.sumOfFirstNIntegers(10));

    }

    @Test
    public void testSumOfFirstNEvenIntegers(){
        assertEquals(0, RecursiveMethods.sumOfFirstNEvenIntegers(0));
        assertEquals(2, RecursiveMethods.sumOfFirstNEvenIntegers(1));
        assertEquals(12, RecursiveMethods.sumOfFirstNEvenIntegers(3));
        assertEquals(30, RecursiveMethods.sumOfFirstNEvenIntegers(5));
        assertEquals(110, RecursiveMethods.sumOfFirstNEvenIntegers(10));
    }

    @Test
    public void testIsPalindromeUsingReverse(){
        assertTrue(RecursiveMethods.isPalindromeUsingReverse(""));
        assertTrue(RecursiveMethods.isPalindromeUsingReverse("a"));
        assertTrue(RecursiveMethods.isPalindromeUsingReverse("racecar"));
        assertTrue(RecursiveMethods.isPalindromeUsingReverse("deified"));
        assertFalse(RecursiveMethods.isPalindromeUsingReverse("hello"));
        assertFalse(RecursiveMethods.isPalindromeUsingReverse("palindrome"));
        assertFalse(RecursiveMethods.isPalindromeUsingReverse("not a palindrome"));
    }

    @Test
    public void testIsPalindromeUsingFirstAndLast(){
        assertTrue(RecursiveMethods.isPalindromeUsingFirstAndLast(""));
        assertTrue(RecursiveMethods.isPalindromeUsingFirstAndLast("a"));
        assertTrue(RecursiveMethods.isPalindromeUsingFirstAndLast("aa"));
        assertTrue(RecursiveMethods.isPalindromeUsingFirstAndLast("racecar"));
        assertTrue(RecursiveMethods.isPalindromeUsingFirstAndLast("deified"));
        assertFalse(RecursiveMethods.isPalindromeUsingFirstAndLast("hello"));
        assertFalse(RecursiveMethods.isPalindromeUsingFirstAndLast("palindrome"));
        assertFalse(RecursiveMethods.isPalindromeUsingFirstAndLast("not a palindrome"));
    }

    @Test
    public void testSumOfDigits(){
        int input = 12345;
        int expectedOutput = 15;
        int actualOutput = RecursiveMethods.sumOfDigits(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testFibonacci(){
        assertEquals(0, RecursiveMethods.fibonacci(0));
        assertEquals(1, RecursiveMethods.fibonacci(1));
        assertEquals(1, RecursiveMethods.fibonacci(2));
        assertEquals(5, RecursiveMethods.fibonacci(5));
        assertEquals(55, RecursiveMethods.fibonacci(10));
    }
}
