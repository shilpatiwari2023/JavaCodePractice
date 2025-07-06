package src.main.java.Collections.List;

import java.util.ListIterator;
import java.util.Vector;

public class Vector_ListIterator {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("item1");
        vector.add("item2");
        vector.add("item3");
        vector.add("item4");
        vector.add("item5");
        ListIterator listIterator = vector.listIterator();

        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

     }
}
