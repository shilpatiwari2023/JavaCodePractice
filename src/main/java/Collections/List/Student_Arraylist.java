package src.main.java.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Student_Arraylist {
    public static void main(String[] args) {
        Student s1 = new Student("pramod", "1");
        Student s2 = new Student("Amit", "2");
        Student s3 = new Student("pramod", "3");

        List<Student> myStudents = new ArrayList();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(myStudents);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();

    }
}
