package org.example;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCounting = true;

        while (continueCounting) {
            System.out.print("Enter a text: ");
            String input = scanner.nextLine().toLowerCase();

            int[] letterCount = new int[26];

            System.out.println("Character counts:");
            for (int i = 0; i < input.length(); i++) {
                char character = input.charAt(i);
                if (character >= 'a' && character <= 'z') {
                    int index = character - 'a';
                    letterCount[index]++;
                }
            }

            for (int i = 0; i < 26; i++) {
                char letter = (char) ('a' + i);
                int count = letterCount[i];
                if (count > 0) {
                    System.out.println(letter + ": " + count);
                }
            }

            System.out.print("Press 'y' to continue, 'Enter' to exit: ");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("y")) {
                continueCounting = false;
            }
        }

        scanner.close();
    }
}
