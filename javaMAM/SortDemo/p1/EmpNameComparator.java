package SortDemo.p1;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<emp> {

    @Override
    public int compare(emp e1, emp e2) {
        String em1Name = e1.getName();
        String em2Name = e2.getName();
        return em1Name.compareTo(em2Name);
    }

}
