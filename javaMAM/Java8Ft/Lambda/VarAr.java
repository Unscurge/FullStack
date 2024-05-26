package Java8Ft.Lambda;

interface VarArgs {
    void sum(int... i);
}

public class VarAr {
    public static void main(String[] args) {
        VarArgs v = (int... i) -> {
            int sum = 0;
            for (int x : i) {
                sum += x;
            }
            System.out.println(sum);
        };
        v.sum(20, 10, 30);
    }

}
