package Java8Ft.Optinel;

import java.util.Optional;

public class optionalDemo {
    public static void main(String[] args) {
        String str = null;
        // without optional
        // if(str==null)
        // {
        // System.out.println("this is Null value");
        // }
        // else{
        // System.out.println(str.length());//nullpionter exception
        // }

        // with optional
        Optional<String> o = Optional.ofNullable(str);
        System.out.println(o.isPresent());
        System.out.println(o.orElse("String is null"));

    }

}
