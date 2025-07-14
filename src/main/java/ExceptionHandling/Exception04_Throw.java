package src.main.java.ExceptionHandling;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exception04_Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age : ");
        int age = scanner.nextInt();
        try {
            if (age >= 18) {
                System.out.println("You are allowed to vote");
            } else {
                System.out.println("You are not allowed to vote");
                throw new IllegalArgumentException("IllegalAgeToVote Exception");
            }

        } catch (Exception e) {
            System.out.println("Exception is : " + e.getMessage());
        }

    }
}
