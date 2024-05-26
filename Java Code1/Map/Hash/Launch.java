package Map.Hash;

import java.util.HashMap;
import java.util.Iterator;

public class Launch {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 4522);
        hm.put(2, 4055);
        hm.put(3, 7066);

        System.out.println(hm.get(1)); // value is accessed by the key.
        Iterator<Integer> itr = hm.keySet().iterator();

        while (itr.hasNext()) // printing all the elements in hashmap with the help of while loop
        {
            Integer key = itr.next();
            System.out.println(hm.get(key));
        }
    }
}
