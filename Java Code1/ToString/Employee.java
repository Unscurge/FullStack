package ToString;

public class Employee {
    int empId;
    String empName;

    Employee(int id, String name) {
        empId = id;
        empName = name;
    }

    public String toString() {
        return "Id : " + empId + " Name : " + empName;// alternative of disp and show method.
    }

}
