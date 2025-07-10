package src.main.java.july2ndweek;
//Java String Program to Print Even-Length Words like do, am, like
public class JavaPassByValue {

    public static void main(String[] args) {

        String s = "alok";
        printWords(s);
        System.out.println(s);
    }

    public static void printWords(String a) {
        a = a + " shilpa";
        System.out.println(a);
    }
}