package CollectionFrame;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map m = new HashMap<>();
        m.put(1, "Chaitanya");
        m.put(2, "Shishir");
        m.put(3, "Arjun");
        m.put(4, "Sanket");
        System.out.println(m);
        System.out.println(m.get(3));
        m.replace(1, "Chaitanya Bankar");
        System.out.println(m);
    }

}
