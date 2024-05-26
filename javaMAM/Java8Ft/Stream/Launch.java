package Java8Ft.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Launch {
    public static void main(String[] args) {
        // List creation
        // 1st way
        List<Integer> list = new ArrayList<>(); // Mutable List Creation
        list.add(20);
        list.add(25);
        list.add(56);
        list.add(45);
        System.out.println(list);

        // List Cretion
        // 2nd way
        List<Integer> list1 = List.of(10, 20, 35, 56, 78, 96, 45);// Immutable List Creation
        System.out.println(list1);
        // list1.add(25); // Can not add Elements in immutable List

        // List creation
        // 3rd way
        List<Integer> li = Arrays.asList(5, 6, 8, 7, 4, 1, 2);// Immutable List
        System.out.println(li);
        // Creating Empty Stream
        Stream<Object> emptyStream = Stream.empty();

        // Array
        String name[] = {"Chaitanya","Arjun","Sanket","Shishir"};
        Stream<String> stream1= Stream.of(name);
        stream1.forEach(e->{
            System.out.println(e);
        });

        // Display name starting with s
        List<String> name1 = List.of("Chaitanya","Arjun","Sanket","Shishir");
        List<String> newName = name1.stream().filter(e-> e.startsWith("S")).collect(Collectors.toList());
        System.out.println(newName);
    }

}
