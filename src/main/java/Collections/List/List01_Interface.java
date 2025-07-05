package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class List01_Interface {
    public static void main(String[] args) {
        //List fruits = new List();  object can't be created for list as it is interface
        List fruits = List.of("orange","apple","guava","mango");
        System.out.println(fruits);
       // fruits.add("chiku");   UnsupportedOperationException - can't add
        //fruits.remove("apple");  UnsupportedOperationException - can't remove
        //solution is - we need to use concrete class like arraylist

        List l = new ArrayList();  //dynamic dispatch
        l.add("chiku");
        l.add("hello");
        l.add("123");
        System.out.println(l);

        }
}
