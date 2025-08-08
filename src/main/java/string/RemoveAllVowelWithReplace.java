package src.main.java.string;

import java.util.Scanner;

public class RemoveAllVowelWithReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String : ");
        String input = scanner.nextLine();
        String result = input.replaceAll("[AEIOUaeiou]","");
        System.out.println("String without vowel : " + result);
    }
}
