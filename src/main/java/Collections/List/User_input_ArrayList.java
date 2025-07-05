package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.Scanner;

public class User_input_ArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        String continueInput = "Y"; //Control variable for input loop
        while (continueInput.equalsIgnoreCase("Y")) {
            System.out.println("Please enter your name : ");
            String name = scanner.next();
            names.add(name);

            System.out.println("Please enter your age : ");
            Integer age = scanner.nextInt();
            ages.add(age);
            scanner.nextLine();
            System.out.println("Do  you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();
             for(Object o1 : names) {
                 System.out.println(o1);
             }
             for(Object o2 : ages) {
                 System.out.println(o2);
             }
            // scanner.close();



        }
    }
}
