package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_List {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(185);
        marks.add(45);
        marks.add(25);
        marks.add(255);
        marks.add(13);
        marks.add(42);
        System.out.println(marks);
        System.out.println(marks.size());
        Collections.sort(marks);
        System.out.println(marks);
        Collections.reverse(marks);
        System.out.println(marks);

    }
}
