package src.main.java;

import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to calculate factorial : ");
        int n = scanner.nextInt();
        //int n = 5;
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }

    private static int factorial(int n) {
        int res = 1;
        for(int i = 2; i <= n; i++) {
            res = res * i;

        }
        return res;
    }
}
