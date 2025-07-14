package src.main.java.july2ndweek;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
    public static void main(String[] args) {
        List<String> shi = new ArrayList<>();
        shi.add("Nishka");
        shi.add("Anika");
        shi.add("Meethi");
        shi.add("Riddhi");
        shi.add("Shilpa");
        System.out.println("Original shi is : " + shi);
        System.out.println(shi.size());
       // Collections.reverse(shi);
        List<String> sublist = new ArrayList<>();
        //sublist = shi.subList(2,6);
        System.out.println(sublist);
        reverseList(shi);
        System.out.println("Reversed shi is : " + shi);
        try {
            String str = null;
            System.out.println(str.length());
        } catch (Error e) {
            System.out.println("Null pointer!");
        } catch (RuntimeException e) {
            System.out.println("General exception.");
        }

    }

    private static void reverseList(List<String> shi) {
        List<String> newList = new ArrayList<>();
        for(int i = shi.size()-1; i >= 0; i--){
            newList.add(shi.get(i));
            //System.out.println("Reversed list is : " + shi.get(i));
        }
        System.out.println(newList);
    }
}
