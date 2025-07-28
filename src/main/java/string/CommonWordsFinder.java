package src.main.java.string;

import java.util.*;

public class CommonWordsFinder {
    public static void main(String[] args) {
        String str1 = "I love Java and Selenium";
        String str2 = "Java and Python are powerful";

        // Convert both strings into sets of words
        List l1 = new ArrayList<>();
        String[] strArr = str1.split("\\s+");
        l1 = Arrays.asList(strArr);
        Set<String> set1 = new HashSet<>(l1);
        //Set<String> set1 = new HashSet<>();
        Set<String> set12 = new HashSet<>();

        Set<String> set2 = new HashSet<>(Arrays.asList(str2.split("\\s+")));

        // Retain common elements in set1
        set1.retainAll(set2);

        System.out.println("Common words: " + set1);
    }
}
