package src.main.java.string;

import java.util.ArrayList;
import java.io.*;
/*

 */
public class SubstringOfAString {
    public static void main(String[] args) {
        String stringInput = new String("The Cat");
        String subString = null;
        //System.out.println(stringInput.substring(0,0));
        for(int i =1 ; i<=stringInput.length(); i++){
            subString = stringInput.substring(0,i);
            System.out.println(subString);
        }
    }
}