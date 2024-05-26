package FuncInterface;

public class launch2 {
    public static void main(String[] args) {
        Cube c = (a) -> {
            return (a * a * a);
        };
        System.out.println(c.cube(3));
        ;

        Lenght l = (b) -> {
            return b.length();
        };
        System.out.println(l.len("Chaitanya"));
    }

}

interface Cube {
    public int cube(int a);
}

interface Lenght {
    public int len(String b);
}
