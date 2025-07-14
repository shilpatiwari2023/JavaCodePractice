package src.main.java.ExceptionHandling;

//Throw and Catch Exception with Try-Catch
public class ExceptionExample_basic {
    public static void main(String[] args) {
        try{
            int result = divideNumber(5,0);
            System.out.println("Result : " + result);
        } catch (Exception e) {
            System.out.println("Error message is : " + e.getMessage());
        }
    }

    private static int divideNumber(int dividend, int divisor) {
        if(divisor == 0){
            throw new ArithmeticException("Number divided by zero is not possible");
        }
        return dividend/divisor;
    }
}
