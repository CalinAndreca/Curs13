package org.fasttrackit.curs15.recursivity;

import java.awt.event.WindowFocusListener;

public class RecursionExercises {
    public static void main(String[] args) {
        //  System.out.println(sumFromOneToParam(10));
        System.out.println(fibonacci(10));

    }

    public static long sumFromOneToParam(long param) {
        if (param == 1) {
            return 1;
        }
        return param + sumFromOneToParam(param - 1);
    }

    public static long fibonacci(long n) {
        System.out.println("entered fibonacii with + " + n);
        if (n == 0 || n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
