package Exception.ThrowThrows;

public class Throwdemo {
    void m1() throws ArithmeticException {
        int x = 20, y = 0;
        int div = x / y;
    }

    public static void main(String[] args) {
        Throwdemo t = new Throwdemo();
        try {
            t.m1();
        } catch (ArithmeticException a) {
            System.out.println(a);
        }
        System.out.println("over");

    }
}
