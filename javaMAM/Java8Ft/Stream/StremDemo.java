package Java8Ft.Stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 10, 15, 13, 2, 4, 85, 65, 44);
        Stream<Integer> stream = list.stream();
        List<Integer> evenList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(list);
        System.out.println("Even Numbers : " + evenList);
        // To find Square of Elements
        List<Integer> sqList = list.stream().map(e -> e * e).collect(Collectors.toList());
        System.out.println("Squares : " + sqList);
        sqList.stream().forEach(System.out::println);// Printing elements using stream for each it prints only elements
                                                     // of list nothing else

    }

}