package src.main.java.ExceptionHandling;

public class Exception08_NullPointerExample {
    public static void main(String[] args) {
        String name = null;
        try {
            name = name.trim(); //java.lang.NullPointerException
            System.out.println(name.trim());
        } catch (NullPointerException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
