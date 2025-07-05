package src.main.java.Collections.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("pramod");
        hs.add("pramod"); //duplicates not allowed so will print once only
        hs.add("saakshi");
        hs.add("akku");
        hs.add("divya");
        System.out.println(hs);

    }
}
