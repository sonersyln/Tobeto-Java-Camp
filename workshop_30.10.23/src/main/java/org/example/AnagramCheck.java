package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
            System.out.print("Enter the first word: ");
            String string1 = scanner.nextLine();

            System.out.print("Enter the second word: ");
            String string2 = scanner.nextLine();

            char[] charArray1 = string1.toCharArray();
            char[] charArray2 = string2.toCharArray();

            boolean result = true;
            if (string1.length() == string2.length()) {
                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                result = Arrays.equals(charArray1, charArray2);
                System.out.println("These two words are anagrams.");
            } else {
                result = false;
                System.out.println("These two words are not anagrams!");
            }

            System.out.print("Press 'y' to continue, 'Enter' to exit: ");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("y")) {
                continueChecking = false;
            }

        }
        scanner.close();
    }
}
