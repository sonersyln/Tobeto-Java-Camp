package org.example;

public class PerfectNumber {
    public static void main(String[] args) {

        int num = 1;
        int perfectCount = 0;

        while (perfectCount < 10) {

            int sum = 0;

            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num + " is a perfect number");
                perfectCount++;
            }
            num++;
        }
    }
}

