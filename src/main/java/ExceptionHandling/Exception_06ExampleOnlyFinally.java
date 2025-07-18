package src.main.java.ExceptionHandling;

public class Exception_06ExampleOnlyFinally {
    public static void main(String[] args) {
        int age = 0;
        try{
            if(age < 18){
                System.out.println("Not allowed to vote");
                throw new IllegalArgumentException("Illegal age for voting");
            }
        }
        finally {
            System.out.println("This is example of code without catch block. Try block need at least one catch block or one finally block ");
        }
    }
}
