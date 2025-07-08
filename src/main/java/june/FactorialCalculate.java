package src.main.java.june;

import java.util.Scanner;

public class FactorialCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to calculate factorial : ");
        long n = scanner.nextInt();
        //int n = 5;
        System.out.println("Factorial of " + n + " is : " + factorial(n));
    }

    private static long factorial(long n) {
        long res = 1;
        for(int i = 2; i <= n; i++) {
            res = res * i;
        }
        return res;
    }
}
