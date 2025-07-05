package src.main.java.Collections.List;

import java.util.LinkedList;

public class LinkedList02 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("dog");
        animals.add("cat");
        animals.addFirst("lion");
        animals.addLast("horse");
        System.out.println("LinkedList of animals : " + animals);
        System.out.println("First element : " + animals.getFirst());
        System.out.println("last element : " + animals.getLast());
        animals.removeFirst();
        animals.removeLast();
        System.out.println("Linkedlist after removal : " + animals);
        System.out.println("Size of Linkedlist : " + animals.size());
    }
}
