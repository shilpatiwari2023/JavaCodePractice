package src.main.java.Collections.SET;

import java.util.*;

public class Set_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        //Hashing mechanism to store the element
        //no order
        //no duplicates
        hs.add("Apple");
        hs.add("orange");
        hs.add("grapes");
        hs.add("grapes");
        hs.add("null");
        hs.add("null");
        System.out.println(hs);
        for (String h : hs) {
            System.out.println("h = " + h);
        }
        Iterator iterator = hs.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("------------------------------------------------------");
        Set lhs = new LinkedHashSet();
        //LinkedList mechanism to store the element
        //order will be maintained, no duplicates
        lhs.add("Dpple");
        lhs.add("Apple");
        lhs.add("Orange");
        lhs.add("Orange");
        lhs.add("Grapes");
        lhs.add("null");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());
        System.out.println("------------------------------------------------------");

        Set ts = new TreeSet();
        //Black and red tree mechanism to store the element
        //order will be maintained, Natural sorting is done
        ts.add("Dpple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
        ts.add("Grapes");
        ts.add("apple");
      // ts.add(null);  // for Null - java.lang.NullPointerException
      //  ts.add(123); //java.lang.ClassCastException
        System.out.println(ts);
        System.out.println("---------------------For each-----------------");
        for(Object o : ts){
            System.out.println(o);
        }



    }
}
