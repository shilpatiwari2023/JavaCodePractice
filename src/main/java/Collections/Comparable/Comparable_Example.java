package src.main.java.Collections.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Example {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Shilpa",40);
        Student s2 = new Student(2,"Swati",38);
        Student s3 = new Student(3,"Shruti",36);

        List<Student> studentlist = new ArrayList();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);

        List marks = new ArrayList();
        marks.add(98);
        marks.add(97);
        marks.add(99);
        marks.add(91);
        marks.add(95);

        Collections.sort(marks);
        System.out.println(marks);
        Collections.sort(studentlist);
        System.out.println(studentlist);



    }


   static class Student implements Comparable<Student>{
        private int roll_no;
        private String name;
        private int age;

        public Student(int roll_no,String name,int age){
            this.roll_no = roll_no;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "roll_no=" + roll_no +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

       /* @Override
        public int compareTo(Student o) {
            return this.roll_no - o.roll_no;
        }*/

      /* @Override
       public int compareTo(Student o) {
           return this.age - o.age;
       }*/

       @Override
       public int compareTo(Student o) {
           return this.name.compareTo(o.name);
       }
   }
}
