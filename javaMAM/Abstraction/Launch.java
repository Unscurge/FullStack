package Abstraction;

public class Launch extends emp {
    public static void main(String[] args) {
        Launch l = new Launch();
        l.display();
    }

    @Override
    void display() {
        System.out.println("Show");
    }
}
