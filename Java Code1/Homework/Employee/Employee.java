package Homework.Employee;

public class Employee {
    static int empId = 0;
    String name;
    float salary;

    Employee(String Name, float Sal) {
        name = Name;
        salary = Sal;
        empId++;
    }

    public void disp() {
        System.out.println("Id : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

}
