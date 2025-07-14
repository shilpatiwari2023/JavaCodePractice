package src.main.java.ExceptionHandling;

public class Exception02_MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 100 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Exception : " + e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutofBoundsException : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception : " + e.getMessage());
        }
    }
}
