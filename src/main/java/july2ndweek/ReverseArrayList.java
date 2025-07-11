package src.main.java.july2ndweek;

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
        reverseList(shi);
        System.out.println("Reversed shi is : " + shi);
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
