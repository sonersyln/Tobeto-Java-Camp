package org.example;

import java.util.Scanner;

public class AmicablePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continueChecking = true;
        while (continueChecking) {
            int number1, number2;

            System.out.print("Enter the first number: ");
            number1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            number2 = scanner.nextInt();

            if (areAmicable(number1, number2)) {
                System.out.println(number1 + " and " + number2 + " are an amicable pair.");
            } else {
                System.out.println(number1 + " and " + number2 + " are not an amicable pair!");
            }

            System.out.print("Press 'y' to continue, 'n' to exit: ");
            String choice = scanner.next().toLowerCase();

            if (choice.equals("n")) {
                continueChecking = false;
            }
        }

        scanner.close();
    }

    public static boolean areAmicable(int number1, int number2) {
        int sum1 = calculateDiv(number1);
        int sum2 = calculateDiv(number2);
        return (number1 == sum2) && (number2 == sum1);
    }

    public static int calculateDiv(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}