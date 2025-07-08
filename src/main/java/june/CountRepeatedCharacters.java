package src.main.java.june;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedCharacters {
    public static void main(String[] args) {
        String input = "Programming";
        countRepeatedCharacter(input);
    }

    private static void countRepeatedCharacter(String input) {
        Map<Character,Integer> charCountMap = new HashMap<>();
        input = input.toLowerCase();
        for(char ch : input.toCharArray()){
            if(Character.isLetter(ch)){
                charCountMap.put(ch,charCountMap.getOrDefault(ch,0) + 1);
            }
        }
        System.out.println("Repeated characters are : ");
        for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }


}

