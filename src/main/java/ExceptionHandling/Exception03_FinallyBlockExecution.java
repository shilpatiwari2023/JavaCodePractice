package src.main.java.ExceptionHandling;

public class Exception03_FinallyBlockExecution {
    public static void main(String[] args) {
        String s = "Shilpa Tiwari";
        char ch[] = s.toCharArray();
        try {
            for (int i = ch.length; i >= 0; i--) {
                System.out.println(ch[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index outofbound : " + e.getMessage());
        }
        finally{
            System.out.println("Finally block will execute once always");
        }
    }
}
