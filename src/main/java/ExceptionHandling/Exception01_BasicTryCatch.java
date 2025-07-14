package src.main.java.ExceptionHandling;
/*
 Must revision before interview
 */
public class Exception01_BasicTryCatch {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;
        try{
            int result = dividend/divisor;
            //Thread.sleep(10000);
        } catch (Exception e) {
            System.out.println("Error message is : " + e.getMessage());
        }
        finally{
            System.out.println("this is example of ArithmeticException");
        }
    }
}
