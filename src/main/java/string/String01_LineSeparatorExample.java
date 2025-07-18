package src.main.java.string;

//Java Program to Print a New Line in String
public class String01_LineSeparatorExample {
    public static void main(String[] args) {
        String newline = System.lineSeparator();
        System.out.print("Shilpa" + newline + "Alok");
        //other options are
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Shilpa");
        System.out.println("Alok");
        System.out.println("---------------------------------");
        System.out.print("Shilpa" + '\n' + "Alok");
    }
}
