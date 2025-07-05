package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Arraylist01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pramod");
        arrayList.add("null");  //null allowed
        arrayList.add("dutta");
        arrayList.add("dutta");  //duplicate is  allowed
        arrayList.add("123");   //different data type allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();  //dynamic dispatch
        l.add("chiku");
        l.add("hello");
        l.add("123");
        System.out.println(l);
        System.out.println(l.isEmpty());

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());




    }
}
