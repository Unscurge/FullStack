package SortDemo.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList();
        List.add(23);
        List.add(15);
        List.add(42);
        List.add(100);
        System.out.println(List);
        Collections.sort(List);
        System.out.println("After : " + List);
    }

}
