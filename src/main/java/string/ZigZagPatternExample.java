package src.main.java.string;

import java.util.Arrays;
import java.util.Collections;

public class ZigZagPatternExample {
    public static void main(String[] args) {
        int[] arr = {1,3,8,5,2,0,4};
        int l = arr.length;
        int[] triplet = new int[l];
        for(int i = 0; i < arr.length-2; i++){
            triplet[i] = checkTriplet(arr[i],arr[i+1],arr[i+2]);

        }
        System.out.println(Arrays.asList(triplet));
    }
   public static int checkTriplet(int a,int b, int c){
        int j = 0;
        if(((a > b) && (b < c)) || (( a< b) && (b > c))){
            j = 1;
            //System.out.println("Triplet is : " + a + "," + b + "," + c);
        } else {
            j = 0;
        }
        return  j;
    }
}
