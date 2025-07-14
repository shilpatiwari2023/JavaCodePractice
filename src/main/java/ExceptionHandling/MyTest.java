package src.main.java.ExceptionHandling;

import java.io.IOException;

public class MyTest {
    public static void main(String[] args) {
        Exception05_Throws ex = new Exception05_Throws();
        try {
            ex.readFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
