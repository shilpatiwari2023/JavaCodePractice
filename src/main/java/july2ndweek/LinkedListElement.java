package src.main.java.july2ndweek;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Practice program to understand linked list methods and CRUD operation
 */
public class LinkedListElement {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Shilpa");
        list.add("1");
        list.add("roll_no 31");
        System.out.println(list.size());
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" Element at index " + i + " = " + list.get(i));
        }
        for(Object o : list){
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

