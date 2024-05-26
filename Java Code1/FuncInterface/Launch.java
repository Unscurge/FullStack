package FuncInterface;

public class Launch {
    public static void main(String[] args) {
        helper h1 = () -> {
            System.out.println("hello");// defining multiple methods of an abstract method without making thier classe
                                        // and implementation.
        };
        h1.help();

        helper h2 = () -> {
            System.out.println("world");
        };
        h2.help();
    }
}

interface helper {
    public void help();
}
