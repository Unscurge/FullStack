package MethodRef;

import java.util.ArrayList;
import java.util.Collections;

public class Launch1 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();

        al.add(new Employee(10, "Chaitanya"));
        al.add(new Employee(15, "ram"));
        al.add(new Employee(12, "Shishir"));// sorting by ascii values not by id
        al.add(new Employee(60, "a"));

        System.out.println(al);
        Collections.sort(al, EmployeeNameComparator::compareName);
        System.out.println(al);
    }
}

class EmployeeNameComparator {
    public static int compareName(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}