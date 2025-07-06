package src.main.java.Collections.Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(3);
        queue.add(11);
        queue.add(4);
        queue.add(60);
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }

    }
}
