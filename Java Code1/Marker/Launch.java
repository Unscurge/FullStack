package Marker;

public class Launch {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e = new Employee(101, "Chaitanya");
        System.out.println(e.toString());
        Employee e1 = (Employee) e.clone();

        System.out.println(e1.toString());
    }
}

class Employee implements Cloneable {
    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
