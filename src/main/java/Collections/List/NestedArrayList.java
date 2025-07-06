package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class NestedArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("lichi");
        fruits.add("chiku");
        System.out.println(fruits);

        List<String> fruits1 = new ArrayList<>();
        fruits1.add("papaya");
        fruits1.add("cherry");
        fruits1.add("dragon fruit");
        System.out.println(fruits1);

        List<String> veg = new ArrayList<>();
        veg.add("potato");
        veg.add("tomato");
        veg.add("onion");
        veg.add("capsicum");
        System.out.println(veg);

        List all_fruits = new ArrayList<>();
        all_fruits.add(fruits);
        all_fruits.add(fruits1);
        all_fruits.add(veg);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(1));



    }
}
