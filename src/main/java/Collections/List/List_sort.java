package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_sort {
    public static void main(String[] args) {
        List l = new ArrayList<>();
        l.add(85);
        l.add(65);
        l.add(81);
        l.add(12);
        l.add(55);
        Collections.sort(l);
        System.out.println(l);

    }
}
