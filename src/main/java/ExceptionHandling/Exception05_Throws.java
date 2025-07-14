package src.main.java.ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception05_Throws {
/*    public static void main(String[] args)  {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }*/
    public void readFile() throws IOException {
        FileReader file = new FileReader("test.txt"); // File not found
        BufferedReader fileInput = new BufferedReader(file);
        System.out.println(fileInput.readLine());
        fileInput.close();
    }
}


