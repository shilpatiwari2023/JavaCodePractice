package src.main.java;

import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter String to reverse : ");
        String input = scanner.next();
        char[] ch = input.toCharArray();
        String reversed = "";
        for(int i = ch.length-1; i >= 0; i--){
            //System.out.println(ch[i]);
            reversed = reversed + ch[i];
        }
        System.out.println(reversed);
    }
}
