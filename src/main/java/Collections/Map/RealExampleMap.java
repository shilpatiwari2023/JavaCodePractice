package src.main.java.Collections.Map;

import java.util.*;

public class RealExampleMap {
    public static void main(String[] args) {
        Map<String, Object> student1 = new HashMap<>();
        student1.put("name", "Pramod");
        student1.put("age", "31");
        student1.put("address", "Delhi");
        student1.put("mobile", "9968541233");

        Map<String, Object> student2 = new HashMap<>();
        student2.put("name", "lucky");
        student2.put("age", "35");
        student2.put("address", "Delhi");
        student2.put("mobile", "995456433");

        System.out.println(student1);
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);

        Set book_read_items = new HashSet();
        book_read_items.add("Secret seven");
        book_read_items.add("Rich dad poor dad");
        book_read_items.add("Atomic habit");
        book_read_items.add("Sapiens");
        book_read_items.add("Sapiens");
        System.out.println(book_read_items);



    }
}
