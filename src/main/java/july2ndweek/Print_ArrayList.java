package src.main.java.july2ndweek;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Print_ArrayList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Pramod");
        list.add("Priya");
        list.add("Praveen");
        list.add("Pinky");
        System.out.println(list);
        // for each
        for(Object o : list){
            System.out.println(o);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
