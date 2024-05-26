package Abstraction;

public class Launch2 extends Nilesh {
    public static void main(String[] args) {
        Launch2 l = new Launch2();
        l.dance();
        l.music();
        l.running();
        l.cooking();
    }
}

abstract class Ramesh {
    abstract void dance();

    abstract void music();

    abstract void running();

    abstract void cooking();
}

abstract class Suresh extends Ramesh {
    void dance() {
        System.out.println("Dancing");
    }

    abstract void music();

    abstract void running();

    abstract void cooking();
}

abstract class Ganesh extends Suresh {
    void music() {
        System.out.println("Singing");

    }

    abstract void running();

    abstract void cooking();
}

abstract class Nilesh extends Ganesh {
    void running() {
        System.out.println("Running");
    }

    void cooking() {
        System.out.println("Cooking");
    }

}