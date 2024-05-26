package Employee;

public class Employee {
    int empId;
    String Name;

    Employee(int id, String name) {
        empId = id;
        Name = name;
    }

    public String disp() {
        System.out.println("id : " + empId);
        System.out.println("Name : " + Name);
        return " ";
    }

}
