package src.main.java.Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountOfVowelUsingRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string to check vowel : ");
        String input = scanner.nextLine();
        System.out.println("Word : " + input + " -> Vowels : " + findVowel(input));
    }
    public static Set<Character> findVowel(String input){
        Set<Character> vowelIsFound = new HashSet<>();
        String vowels = "AEIOUaeiou";
        for(char ch:input.toCharArray()){
            if(vowels.indexOf(ch)!= -1){
                vowelIsFound.add(ch);
            }
        }
        return vowelIsFound;
    }
}
