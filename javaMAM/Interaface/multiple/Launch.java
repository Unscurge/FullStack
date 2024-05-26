package Interaface.multiple;

public class Launch implements parent1, parent2 {
    @Override
    public void m2() {

    }

    @Override
    public void m1() {

    }

    public static void main(String[] args) {
        parent1 p = new Launch();
        parent2 p1 = new Launch();
        p.m1();
        p1.m2();

    }
}

interface parent1 {
    void m1();
}

interface parent2 {
    void m2();
}