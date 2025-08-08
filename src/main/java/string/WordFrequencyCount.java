package src.main.java.string;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCount {
    public static void main(String[] args) {
        String input = "java is java again java";
        String[] words = input.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
