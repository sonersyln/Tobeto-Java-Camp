package org.example;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            int mainNumber = number;
            int result = 0;
            int n = 0;

            while (mainNumber != 0) {
                mainNumber /= 10;
                n++;
            }

            mainNumber = number;

            while (mainNumber != 0) {
                int digit = mainNumber % 10;
                result += (int) Math.pow(digit, n);
                mainNumber /= 10;
            }

            if (result == number) {
                System.out.println(number + " is an Armstrong number!");
            } else {
                System.out.println(number + " is not an Armstrong number!");
            }

            System.out.print("Do you want to check another number? (Y/N): ");
            String choice = scanner.next().toLowerCase();
            if (choice.equals("n")) {
                continueProgram = false;
            }
        }

        scanner.close();

    }
}