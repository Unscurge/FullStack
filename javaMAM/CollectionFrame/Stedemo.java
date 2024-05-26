package CollectionFrame;

import java.util.HashSet;
import java.util.Set;

public class Stedemo {
    public static void main(String[] args) {
        Set s = new HashSet<>();

        s.add(101);
        s.add(102);
        s.add(103);
        s.add(104);
        s.add(105);
        s.add(null);
        s.add(null);
        s.remove(101);
        s.add("Chaitanya");

        System.out.println(s.hashCode());
    };
}
