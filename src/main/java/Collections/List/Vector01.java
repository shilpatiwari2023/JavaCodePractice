package src.main.java.Collections.List;

import java.util.Iterator;
import java.util.Vector;

public class Vector01 {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);
        v.add("pramod");
        v.add("dutta");
        v.add("null");
        System.out.println(v);
        System.out.println("---------------------------------------");
        v.remove("dutta");
        System.out.println(v.contains("lucky"));
        System.out.println(v.contains("dutta"));
        System.out.println(v.contains("pramod"));
        System.out.println(v);
        System.out.println("-------------normal for loop-----------------------");
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }

        //for each loop
        System.out.println("-------------for each loop-----------------------");
        for(Object o : v){
            System.out.println(o);
        }

        // Iterator
        System.out.println("-------------Iterator-----------------------");
        Iterator iterator  = v.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }





    }
}
