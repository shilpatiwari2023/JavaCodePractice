package src.main.java;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String to check Palindrome :");
        String input = scanner.next();
        System.out.println("Length of String : " + input.length());
        String reversed = reversedString(input);
        if(reversed.equalsIgnoreCase(input)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }

    private static String reversedString(String input) {
       char[] ch = input.toCharArray();
       String reversed = "";
        for(int i = input.length()-1; i >= 0; i--){
            reversed = reversed + input.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }
}
