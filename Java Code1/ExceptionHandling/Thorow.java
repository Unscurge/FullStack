package ExceptionHandling;

public class Thorow {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        try {
            a.m1(10, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Arithmetic {
    public void m1(int n1, int n2) {
        /*
         * if (n1 < 1) {
         * throw new ArithmeticException("Negative Number");
         * } else {
         * System.out.println("Operation Performed Succesfully");
         * }
         */
        try {
            System.out.println("Division : " + n1 / n2);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error is occured in the method");
        }

    }
}
