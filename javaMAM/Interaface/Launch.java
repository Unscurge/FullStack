package Interaface;

public class Launch implements I1 {
    public static void main(String[] args) {
        I1 hh = new Launch();
        hh.m1();
        hh.m2();
    }

    @Override
    public void m1() {
        System.out.println("Display");
    }
}

interface I1 {
    void m1();

    default void m2() {
        System.out.println("Show");
    }
}