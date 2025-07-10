package src.main.java.july2ndweek;
//Java String Program to Print Even-Length Words like do, am, like
public class JavaPassByReference {

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        changeName(p);
        System.out.println("Name = " + p.name); // Output: Name = John
    }
    public static void changeName(Person p) {
        p = new Person();
        p.name = "John";
    }
}

class Person {
    String name;
}