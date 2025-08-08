package src.main.java.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllUniqueCharacterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to check : ");
        String str = scanner.nextLine();
        if (hasAllUniqueChars(str)) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does NOT have all unique characters.");
        }
    }

    public static boolean hasAllUniqueChars(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (charSet.contains(ch)) {
                return false; // Duplicate character found
            }
            charSet.add(ch);
        }
        return true; // All characters are unique
    }
}
