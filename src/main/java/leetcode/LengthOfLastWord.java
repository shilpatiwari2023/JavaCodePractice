package src.main.java.leetcode;

import java.util.Scanner;

public class LengthOfLastWord  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string : ");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String word;
        int len = 0;
        for(int i = words.length-1; i >= 0; i--) {
            word = words[i];
            len = word.length();
        }
        System.out.println("Length of last word : " + len);
    }
}
