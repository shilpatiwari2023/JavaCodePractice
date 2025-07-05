package src.main.java;

public class RemoveCharactersFromString {
    public static void main(String[] args) {
        String str = "admin$123key45";
        String digitsonly = str.replaceAll("[^(0-9)]","");
        System.out.println("String without character is :" + digitsonly);
    }
}
