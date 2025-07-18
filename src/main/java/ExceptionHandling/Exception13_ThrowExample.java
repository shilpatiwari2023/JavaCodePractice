package src.main.java.ExceptionHandling;

import java.util.Scanner;

public class Exception13_ThrowExample {
    public static void main(String[] args) {
        boolean canIgoToGoa = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter age : ");
        int age = scanner.nextInt();
        try {
            validateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18 so not allowed to go to GOA!");
        }
        return validateAge(age);
    }
}

