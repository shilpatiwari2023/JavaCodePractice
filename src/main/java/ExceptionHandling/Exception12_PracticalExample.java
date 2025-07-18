package src.main.java.ExceptionHandling;

public class Exception12_PracticalExample {
    public static void main(String[] args) {
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); //NumberFormatException
            int b = 100/a; //ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am optional block but will execute always");
        }
    }
}
