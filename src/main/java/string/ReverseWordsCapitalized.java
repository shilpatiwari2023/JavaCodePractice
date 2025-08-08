package src.main.java.string;

import java.util.Scanner;
/*
input = india is great
output = Great Is India
 */
public class ReverseWordsCapitalized {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String : ");
        String input = scanner.nextLine();
        //String input = "india is great";
        char[] ch = input.toCharArray();
        String firstReverse = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            firstReverse = firstReverse + ch[i];
        }
        input = firstReverse + " ";
        System.out.println("First complete reversed word is : " + input);
        String[] words = input.split(" ");
        String secondReverseAtPlace = "";
        for (String word : words) {
            char[] ch1 = word.toCharArray();
            for (int j = word.length() - 1; j >= 0; j--) {
                secondReverseAtPlace = secondReverseAtPlace + ch1[j];
            }
            secondReverseAtPlace = secondReverseAtPlace + " ";
        }
        System.out.println("Second reversed word at its place : " + secondReverseAtPlace);
        String capitalized = "";
        String[] words1 = secondReverseAtPlace.split(" ");
        for (String word1 : words1) {
            if (!word1.isEmpty()) {
                capitalized = capitalized + word1.substring(0, 1).toUpperCase() + word1.substring(1).toLowerCase();
                capitalized = capitalized + " ";
            }
        }
        System.out.println("Final result is : " + capitalized);
    }
}
