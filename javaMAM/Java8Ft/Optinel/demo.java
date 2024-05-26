package Java8Ft.Optinel;

import java.util.Optional;

public class demo {
    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checknull = Optional.ofNullable(words[5]);
        if (checknull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.println(word);
        } else {
            System.out.println("String is null");
        }
    }

}
