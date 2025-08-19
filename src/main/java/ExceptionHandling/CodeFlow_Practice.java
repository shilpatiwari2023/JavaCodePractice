package src.main.java.ExceptionHandling;

public class CodeFlow_Practice {
    public static void main(String[] args) {
        System.out.println(testMethod());
    }
    public static int testMethod() {
        try {
            System.out.println("In try");
            return 10;
        } catch (Exception e) {
            System.out.println("In catch");
            return 20;
        } finally {
            System.out.println("In finally");
            return 30;
        }
    }
}
