package src.main.java.string;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfVowels {
    public static void main(String[] args) {
        String input = "Click on RUN button to see the output";
        input = input.toLowerCase();
        String result = "";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        result = input.replaceAll("[AEIOUaeiou]", "");
        System.out.println("String without vowel : " + result);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 1) {
                System.out.println((entry.getKey() + " : " + entry.getValue()));
            }
        }
    }
}
