package src.main.java.july2ndweek;

import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
       Integer[] arr = list.toArray(new Integer[0]);
       for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }

    }
}
