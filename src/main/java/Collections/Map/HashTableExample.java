package src.main.java.Collections.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"id");
        ht.put(11, "roll");
        ht.put(342,"name");
        ht.put(251,"address");
       // ht.put(null, 1); //java.lang.NullPointerException  ; key and value can't be null
       // ht.put("city", null);  // java.lang.NullPointerException
        System.out.println(ht);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("id", 10);
        hm.put("roll", 11);
        hm.put("name", 349);
        hm.put("address", 51);
         hm.put(null, 12); //key and value can be null
         hm.put("city", null);  //not thread safe, not synchronized
        System.out.println(hm);

        Enumeration<Integer> e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }



    }
}
