package Java8Ft.Lambda;

@FunctionalInterface
interface factorial {
    void fact(int x);
}

public class fatorial {
    public static void main(String[] args) {

        factorial f = (x) -> {
            int fact = 1;
            for (int i = 1; i <= x; i++) {

                fact = fact * i;
            }
            System.out.println(fact);
        };
        f.fact(3);
    }

}
