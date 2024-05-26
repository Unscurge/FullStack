package covariant;

public class Launch {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getEmployee());

        Manager m = new Manager();
        System.out.println(m.getEmployee());
    }

}

class Employee {
    public Employee getEmployee() {
        return new Employee();
    }
}

class Manager extends Employee {
    @Override
    public Manager getEmployee() {
        return new Manager();
    }
}
