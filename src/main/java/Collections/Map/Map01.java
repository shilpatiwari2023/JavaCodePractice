package src.main.java.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("name","Pramod");
        m1.put("roll_no","25");
        m1.put("mobile","898856622");
        m1.put("age","40");
        m1.put("address","Mumbai");
        System.out.println(m1);

        Map m2 = new LinkedHashMap();
        m2.put("name","Pramod");
        m2.put("roll_no","25");
        m2.put("mobile","898856622");
        m2.put("age","40");
        m2.put("address","Mumbai");
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("name","Pramod");
        m3.put("roll_no","25");
        m3.put("mobile","898856622");
        m3.put("age","40");
        m3.put("address","Mumbai");
        System.out.println(m3);


    }
}
