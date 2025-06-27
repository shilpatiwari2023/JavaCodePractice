package src.main.java;

import java.util.Scanner;

public class Swap2Number {
    public static void main(String[] args) {
       //with third variable
        /* int a = 5;
        int b = 8;
        int swap;
        swap = a;
        a = b;
        b = swap;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b); */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        System.out.println("Please enter second number : ");
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        swapNumbers(a,b);
    }
// without third variable
    public static void swapNumbers(int a, int b) {
        a = a +b ;
        b = a - b;
        a = a - b;
        System.out.println("First number is : " + a);
        System.out.println("Second number is : " + b);
    }
}
