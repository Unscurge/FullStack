package Inheritance.sup;

public class Launch {
    public static void main(String[] args) {
        manager m = new manager();
        m.hashCode();
    }
}

class Employee {
    Employee() {
        System.out.println("Employee Class Construtor invoked");
    }

    public void disp() {
        System.out.println("Displaying");
    }
}

class manager extends Employee {
    manager() {
        System.out.println("manager class constructor invoked");
        disp();
    }
}
