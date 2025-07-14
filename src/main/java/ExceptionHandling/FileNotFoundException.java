package src.main.java.ExceptionHandling;

import java.io.File;
import java.util.Scanner;

//Throw Exception if File Not Found
public class FileNotFoundException {
    public static void main(String[] args) {
        try {
            readFileFromMethod();
        } catch (java.io.FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readFile(String fileName) throws java.io.FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        // Read and process the contents of the file
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
    public static void readFileFromMethod()  throws java.io.FileNotFoundException{
            readFile("test1.txt");

    }
}
