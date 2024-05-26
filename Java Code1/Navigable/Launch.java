package Navigable;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Launch {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();

        ts.add(53);
        ts.add(12);
        ts.add(65);

        System.out.println(ts);// TreeSet automatically ascend the order in the list.
        System.out.println(ts.descendingSet());// Printing in descending order.
    }
}
