package src.main.java.ExceptionHandling;

import java.util.Scanner;

//Throw Exception for Odd Number
public class ExceptionForOddNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to check Even/Odd : ");
        int input = scanner.nextInt();
        try {
            Thread.sleep(1000);
            try {
                if (input % 2 != 0) {
                    System.out.println("The number is Odd");
                    throw new IllegalArgumentException("Odd number so Exception appeared.");
                }
            } catch (Exception e) {
                System.out.println("Error is : " + e.getMessage());
            }
        } catch (InterruptedException e) {
            //throw new RuntimeException(e);
        }
    }
}
