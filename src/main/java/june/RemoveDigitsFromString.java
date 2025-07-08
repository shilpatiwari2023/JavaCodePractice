package src.main.java.june;

public class RemoveDigitsFromString {
    public static void main(String[] args) {
        String str = "Admin$123password45";
        String Characteronly = str.replaceAll("[^(a-z)(A-Z)]","");
        System.out.println("String without digits is : " + Characteronly);
    }
}
