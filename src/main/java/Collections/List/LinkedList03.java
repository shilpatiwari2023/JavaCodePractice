package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList03 {
    public static void main(String[] args) {
        List mylist = new ArrayList(); //continuous memory
        List mylist0 = new ArrayList();

        List mylist1 = new LinkedList(); //doubly linked list
        mylist1.add("Pramod");
        mylist1.add("dutta");
        mylist1.add("null");
        mylist1.add("amit");
        mylist1.add("meenu");
        mylist1.add("ritwik");
        mylist1.add("true");
        mylist1.add("123");
        System.out.println(mylist1);

        System.out.println(mylist1.isEmpty());
        System.out.println(mylist1.size());
        System.out.println(mylist1.contains("dutta"));
        System.out.println(mylist1.indexOf("null"));
    }
}
