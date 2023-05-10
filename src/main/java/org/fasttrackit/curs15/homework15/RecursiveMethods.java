package org.fasttrackit.curs15.homework15;

public class RecursiveMethods {

    public static int sumOfFirstNIntegers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfFirstNIntegers(n - 1);
        }
    }

    public static int sumOfFirstNEvenIntegers(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 2 * n + sumOfFirstNEvenIntegers(n - 1);
        }
    }

    public static boolean isPalindromeUsingReverse(String word) {
        if (word.length() <= 1) {
            return true;
        } else {
            return word.charAt(0) == word.charAt(word.length() - 1)
                    && isPalindromeUsingReverse(word.substring(1, word.length() - 1));
        }
    }

    public static boolean isPalindromeUsingFirstAndLast(String s) {
        if (s == null) {
            return false;
        }
        int len = s.length();
        if (len <= 1) {
            return true;
        }
        char firstChar = s.charAt(0);
        char lastChar = s.charAt(len - 1);
        if (firstChar != lastChar) {
            return false;
        } else {
            String subString = s.substring(1, len - 1);
            return isPalindromeUsingFirstAndLast(subString);
        }
    }

    public static int sumOfDigits(int num) {
        int sum =0;
        while (num > 0){
            sum += num%10;
            num /=10;
        }
        return sum;
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
