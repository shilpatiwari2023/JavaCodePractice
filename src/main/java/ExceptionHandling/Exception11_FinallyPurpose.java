package src.main.java.ExceptionHandling;

import java.util.Scanner;

public class Exception11_FinallyPurpose {
    public static void main(String[] args) {
        Scanner scanner = null;
        scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        try {
            int b = 10/v;
            System.out.println(b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("End of program, scanner is closed");
        }

    }
}
