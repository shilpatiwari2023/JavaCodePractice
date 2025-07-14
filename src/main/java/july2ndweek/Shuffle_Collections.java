package src.main.java.july2ndweek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alok");
        list.add("Anup");
        list.add("Aakash");
        list.add("Shilpa");
        list.add("Alok");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
