package Java8Ft.Lambda;

@FunctionalInterface
interface fun {
    void show();
}

public class Launch {

    public static void main(String[] args) {
        // Without Using lambda expression
        // fun f = new fun() {

        // @Override
        // public void show() {
        // System.out.println("Welcome");
        // }

        // };
        // f.show();

        // By using Lambda
        fun f = () -> {
            System.out.println("Welcome Back...!!");
        };
        f.show();
    }

}
