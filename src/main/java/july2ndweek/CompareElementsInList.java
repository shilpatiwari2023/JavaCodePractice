package src.main.java.july2ndweek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Java Program to Compare Elements in a Collection
public class CompareElementsInList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(25);
        list.add(69);
        list.add(20);
        list.add(14);
        System.out.println(list);
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Maximum element is : " + max);
        System.out.println("Minimum element is : " + min);
        if(max==min){
            System.out.println("All elements of the list are same");
        }


    }
}
