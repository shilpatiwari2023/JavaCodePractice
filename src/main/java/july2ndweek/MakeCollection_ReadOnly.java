package src.main.java.july2ndweek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//// Java Program to make Collections Read-Only
public class MakeCollection_ReadOnly {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(14);
        list.add(28);
        list.add(42);
        list.add(56);
        list.add(70);
        list.add(84);
        System.out.println(list);
        list.add(98);
        list.remove(4);
        System.out.println(list.get(5));
        System.out.println("After some action list is : " + list);
        //for making readonly class unmodifiable() is used
        try {
            list = Collections.unmodifiableList(list);
            // This line will generate an Exception
            list.remove(2);
        } catch (UnsupportedOperationException unsupportedOperationException) {
            System.out.println("Exceptions is " + unsupportedOperationException);
        }
        finally {
            System.out.println(list.get(3));
            System.out.println("Now list is only Read-Only");

        }
    }
}
