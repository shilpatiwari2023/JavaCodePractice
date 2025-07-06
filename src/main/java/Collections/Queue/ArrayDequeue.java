package src.main.java.Collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeue {
    public static void main(String[] args) {
        Deque<Integer> dequeue = new ArrayDeque();
        dequeue.push(14);
        dequeue.push(84);
        dequeue.push(25);
        dequeue.push(28);
        System.out.println(dequeue);

    }
}
