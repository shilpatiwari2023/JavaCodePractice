package src.main.java;

public class UseOfStaticVariable {
    public static void main(String[] args) {
       Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
 class Counter {
    static int count = 0;
    Counter(){
        count++;
        System.out.println("Count is : " + count);
    }
}



