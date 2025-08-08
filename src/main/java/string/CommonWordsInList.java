package src.main.java.string;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.ArrayList;

// Find common words of List
public class CommonWordsInList {
    public static void main(String[] args) {
        //List<String> list1 = Arrays.asList("apple", "banana", "mango", "grape");
        List<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        List<String> list2 = Arrays.asList("grape", "apple", "pear");

        list1.retainAll(list2);
        System.out.println("Common: " + list1);
    }
}
