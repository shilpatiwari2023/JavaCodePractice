package src.main.java.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacterFromString {
    public static void main(String[] args) {
        String str = "programming";

        Set<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        System.out.println(set);
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        System.out.println("String after removing duplicates: " + result);
    }


}

