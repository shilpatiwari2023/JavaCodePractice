package src.main.java.ExceptionHandling;

public class Exception10_FinallyConcept {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        //int b = 2;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will always be executed");
        }

    }
}
