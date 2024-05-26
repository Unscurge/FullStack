package Calci;

public class Arithmetic {
    public void multiply(int a, int b) {
        System.out.println("multiplication : " + (a * b));
    }

    public void multiply(int a, float b) {
        System.out.println("Multiplication : " + (a * b));// data type change
    }

    public void multiply(float b, int a) {
        System.out.println("Multiplication : " + (a * b));// sequence change
    }

    public void multiply(int a, int b, int c) {
        System.out.println("Multiplicaation : " + (a * b * c));// number of parameters change
    }
}
// "this" is the keyword in java which point towards the current object of the
// class