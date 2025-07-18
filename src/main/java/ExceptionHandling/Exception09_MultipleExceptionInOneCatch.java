package src.main.java.ExceptionHandling;

//We can give multiple exception in OR in one catch
public class Exception09_MultipleExceptionInOneCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            s.trim();
            int result = 10 / 0;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
