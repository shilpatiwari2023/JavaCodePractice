package src.main.java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Map_Iterate {
    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("id", 1);
        m1.put("id1", 96);
        m1.put("id2", 85);
        m1.put("id3", 58);
        m1.put("id", 125);
        m1.put(null, 11);
        System.out.println(m1);

        for(Map.Entry<String,Integer> entry : m1.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }



    }
}
