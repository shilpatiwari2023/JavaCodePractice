package src.main.java.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("id", 1);
        map.put("id", 1);
        map.put("id2", 12);
        map.put("id3", 61);
        map.put("id5", 52);
        map.put("id4", 74);
        map.put("id6", null);
        map.put(null, 102);
        map.put(null, 110);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id3"));
        System.out.println(map.containsValue("142"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));

    }
}
