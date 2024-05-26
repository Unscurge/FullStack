package CollectionFrame;

import java.util.HashSet;
import java.util.Iterator;

public class HasSetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add(101);
        hs.add(102);
        hs.add(103);
        hs.add(104);
        hs.add(105);
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
