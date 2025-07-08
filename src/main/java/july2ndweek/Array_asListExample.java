package src.main.java.july2ndweek;

import java.util.Arrays;
import java.util.List;

public class Array_asListExample {
    public static void main(String[] args) {
        String[] str = {"Shilpa","Swati","Shruti","Alok","Manish","Rohit"};
       for(int i = 0; i < str.length; i++){
           System.out.println(str[i]);
       }
       List arrayList = Arrays.asList(str);
        System.out.println(arrayList);

    }
}
