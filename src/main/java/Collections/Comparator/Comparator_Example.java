package src.main.java.Collections.Comparator;

import src.main.java.Collections.Comparable.Comparable_Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Example {
    public static void main(String[] args) {
        Student1 s1 = new Student1(11, "Zlok", 23);
        Student1 s2 = new Student1(45, "swati", 13);
        Student1 s3 = new Student1(31, "shubhi", 21);

        List<Student1> student1List = new ArrayList();
        student1List.add(s1);
        student1List.add(s2);
        student1List.add(s3);


        System.out.println(student1List);
        Comparator nameComparator = new NameComparator();
        Collections.sort(student1List, nameComparator);

        System.out.println(student1List);
        Collections.sort(student1List,new AgeComparator());
        System.out.println(student1List);
        Collections.sort(student1List,new Roll_NoComparator());
        System.out.println(student1List);
    }
}

class NameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
class  AgeComparator implements Comparator<Student1> {
        @Override
        public int compare(Student1 o1, Student1 o2) {
            return o1.getAge() - o2.getAge();
        }
    }

class Roll_NoComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 o1, Student1 o2) {
        return o1.getRoll_no() - o2.getRoll_no();
    }
}

    class Student1  {
        private int roll_no;
        private String name;
        private int age;

        public Student1(int roll_no, String name, int age) {
            this.roll_no = roll_no;
            this.name = name;
            this.age = age;

        }

        public int getRoll_no() {
            return roll_no;
        }

        public void setRoll_no(int roll_no) {
            this.roll_no = roll_no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student1{" +
                    "roll_no=" + roll_no +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }



