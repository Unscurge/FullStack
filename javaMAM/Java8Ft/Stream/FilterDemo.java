package Java8Ft.Stream;

import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 1, 15, 65, 63, 69, 75, 78, 71, 74, 12);
        List<Integer> evenList = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toList());// without making
                                                                                                    // object of stream
                                                                                                    // using filter
                                                                                                    // "only"

        System.out.println(list);
        System.out.println("Divisible by 3" + evenList);
    }

}
