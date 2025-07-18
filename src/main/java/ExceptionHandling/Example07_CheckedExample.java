package src.main.java.ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example07_CheckedExample {
    public static void main(String[] args) throws FileNotFoundException {
        //Checked Example
        FileInputStream fileinput = new FileInputStream("testdata.txt");

    }
}
