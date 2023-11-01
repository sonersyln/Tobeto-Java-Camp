package org.example;

public class PerfectNumber {
    public static void main(String[] args) {
        int count = 0; // The count of found perfect numbers
        long number = 2; // The starting value of the number used in the formula

        System.out.println("10 Perfect Numbers:");

        while (count < 10) {
            // Calculate the perfect number
            long perfect = ((1L << number) - 1) * (1L << (number - 1));

            if (isPerfect(perfect)) { // Check if it's a perfect number
                System.out.println(perfect); // Print the perfect number
                count++;
            }
            number++;
        }
    }

    // A function to check whether a number is perfect
    public static boolean isPerfect(long n) {
        long sum = 1; // 1 is always used as a divisor
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum == n; // Is the sum of divisors equal to the original number?
    }

}