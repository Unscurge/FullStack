package EmpShort;

import java.util.Scanner;

public class Employee1 {
    static int i = 0;
    static int count = 0;
    Scanner sc = new Scanner(System.in);
    int size;
    Employee emp[] = new Employee[5];
    Employee emp1[] = new Employee[4];

    public void insert() {

        Employee e = new Employee();

        System.out.print("\nEnter Id : ");
        int id = sc.nextInt();
        e.setEmpId(id);

        System.out.print("Enter Name : ");
        String nm = sc.next();
        e.setName(nm);

        emp[i] = e;
        i++;
        count++;
        System.out.println("\nInserted Successfully!\n");

    }

    public void read() {
        for (int j = 0; j < count; j++) {
            System.out.println(emp[j].toString());
        }
    }

    public void update() {
        System.out.print("Enter EmpId : ");
        int id = sc.nextInt();
        for (int j = 0; j < count; j++) {
            if (emp[j].getEmpId() == id) {
                System.out.print("Enter New Name : ");
                String name = sc.next();
                System.out.print("Enter New Id : ");
                int empid = sc.nextInt();

                emp[j].setEmpId(empid);
                emp[j].setName(name);
            }
        }
    }

    public void delete() {
        System.out.println("Enter Id to be Deleted : ");
        int id = sc.nextInt();
        for (int j = 0, k = 0; j < count; j++) {
            if (emp[j].getEmpId() != id) {
                emp1[k] = emp[j];
                k++;
            }
        }
        System.out.println("Item Deleted!");
    }
}
