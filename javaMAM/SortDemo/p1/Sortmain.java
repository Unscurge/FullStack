package SortDemo.p1;

import java.util.ArrayList;
import java.util.Collections;

public class Sortmain {
    public static void main(String[] args) {
        ArrayList<emp> em = new ArrayList<>();
        em.add(new emp(103, "Chaitanya", "Nagpur"));
        em.add(new emp(104, "Shishir", "Varanasi"));
        em.add(new emp(102, "Arjun", "Jammu"));
        em.add(new emp(101, "Sanket", "Nagpur"));
        // System.out.println(em);
        // Collections.sort(em);
        // System.out.println("new : " + em); Comparable
        System.out.println(em);
        Collections.sort(em, new EmpNameComparator());
        System.out.println("After Sorting : " + em);

    }

}
