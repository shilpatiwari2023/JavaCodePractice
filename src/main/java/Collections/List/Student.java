package src.main.java.Collections.List;

public class Student {


    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    private String name;
    private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
public void printDetails() {
System.out.println("name: " + this.name);
System.out.println("rollNo: " + this.rollNo);
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
