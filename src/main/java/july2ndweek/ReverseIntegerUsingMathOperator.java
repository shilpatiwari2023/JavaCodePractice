package src.main.java.july2ndweek;
import java.util.Scanner;

public class ReverseIntegerUsingMathOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to reverse : ");
        int num = scanner.nextInt();
        //int num = 1247;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed integer is : " + reversed);
    }
}
