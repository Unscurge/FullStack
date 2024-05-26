package Java8Ft.Default;

interface Drawable {
    default void fibonacci(int x) {
        int x1 = 0;
        int x2 = 1;
        int x3;
        System.out.print(x1 + "\t" + x2);
        for (int i = 2; i < x; i++) {
            x3 = x2 + x1;
            System.err.print("\t" + x3);
            x1 = x2;
            x2 = x3;
        }
    }
}

public class Draw {
    public static void main(String[] args) {
        Drawable d = new Drawable() {

        };
        d.fibonacci(5);
    }

}
