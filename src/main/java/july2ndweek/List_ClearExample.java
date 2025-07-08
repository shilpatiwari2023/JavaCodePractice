package src.main.java.july2ndweek;

import java.util.LinkedList;
import java.util.List;

public class List_ClearExample {
    public static void main(String[] args) {
        List<String> l = new LinkedList<>();
        l.add("Shilpa");
        l.add("Swati");
        l.add("Shruti");
        l.add("Shweta");
        l.add("Shlok");
        l.add("Manisha");
        System.out.println(l);
        l.clear();
        System.out.println(l);
    }
}
