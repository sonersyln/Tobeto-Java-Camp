package org.example;

import java.util.Scanner;

public class UniqueCharacterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueChecking = true;

        while (continueChecking) {
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        boolean unique = uniqueCharacters(input);

        if (unique) {
            System.out.println("This word does not have all unique characters!");
        } else {
            System.out.println("This word has all unique characters.");
        }
            System.out.print("Press 'y' to continue, 'Enter' to exit: ");
            String choice = scanner.nextLine().toLowerCase();

            if (!choice.equals("y")) {
                continueChecking = false;
            }

        }
        scanner.close();
    }
    public static boolean uniqueCharacters(String input){
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}