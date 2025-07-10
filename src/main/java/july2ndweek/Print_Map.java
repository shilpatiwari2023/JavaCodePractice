package src.main.java.july2ndweek;

import java.util.HashMap;
import java.util.Map;

public class Print_Map {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("shilpa",25);
        map.put("sneha",22);
        map.put("shweta",12);
        map.put("lovely",21);
        map.put("mamta",25);
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue() );
        }
    }
}
