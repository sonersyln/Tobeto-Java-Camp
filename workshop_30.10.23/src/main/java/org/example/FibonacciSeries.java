package org.example;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 100;
        long a = 0, b = 1;

        System.out.println("1. Fibonacci Number: " + a);
        System.out.println("2. Fibonacci Number: " + b);

        for (int i = 2; i < n; i++) {
            long next = a + b;
            System.out.println((i + 1) + ". Fibonacci Number: " + next);
            a = b;
            b = next;
        }
    }
}

