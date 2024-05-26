package CollectionFrame;

import java.util.ArrayList;

public class Cnew {
    public static void main(String[] args) {
        ArrayList a = new ArrayList<>();
        a.add(101);
        a.add("Chaitanya");
        a.add(103);
        a.add(102.5f);
        a.add(101);
        a.remove(2);

        for (Object i : a) {
            System.out.println(i);
        }
    }
}
