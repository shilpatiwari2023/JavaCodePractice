package src.main.java.string;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "java and selenium";
        Map<Character, Integer> map = new HashMap<>();
//another method use as this below code gives correct result for java input only
        /*for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }*//*

        System.out.println(map);*/
        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                map.put(ch,map.getOrDefault(ch,0) + 1);
            }
        }
        System.out.println("Repeated characters are : ");
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
