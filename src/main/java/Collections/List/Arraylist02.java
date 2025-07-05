package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Arraylist02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("4");
        list.add("true");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));
        System.out.println("----------------------------------");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        list.clear();
        System.out.println(list);

//javap java.util.ArrayList - gives all the functions of ArrayList
    }
}
