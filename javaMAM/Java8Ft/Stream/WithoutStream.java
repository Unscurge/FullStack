package Java8Ft.Stream;

import java.util.ArrayList;
import java.util.List;

public class WithoutStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 25, 23, 24, 9, 6, 5, 78, 41);
        List<Integer> listeven = new ArrayList<>();

        for (Integer i : list) {
            if (i % 2 == 0) {
                listeven.add(i);
            }
        }
        System.out.println(list);
        System.out.println("Even numbers : " + listeven);
    }

}
