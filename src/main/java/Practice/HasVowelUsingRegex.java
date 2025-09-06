package src.main.java.Practice;

import java.util.Scanner;

public class HasVowelUsingRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to check vowel : ");
        String input = scanner.nextLine();
        System.out.println(hasVowel(input));
    }
public static boolean hasVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}
