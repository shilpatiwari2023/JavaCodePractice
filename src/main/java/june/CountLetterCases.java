package src.main.java.june;

import java.util.Scanner;

public class CountLetterCases {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter string with capital and small letters : ");
        String input = scanner.nextLine();
        // String input = "Java Programming Is Fun";
        countLetterCases(input);
    }
    public static void countLetterCases(String input){
        int count_Uppercase = 0;
        int count_Lowercase = 0;
        for(char ch : input.toCharArray()){
            if(Character.isUpperCase(ch)){
                count_Uppercase = count_Uppercase + 1 ;
            } else if (Character.isLowerCase(ch)) {
                count_Lowercase = count_Lowercase + 1 ;
            }
        }
        System.out.println("Total uppercase letters are : " + count_Uppercase);
        System.out.println("Total lowercase letters are : " + count_Lowercase);
    }
}

