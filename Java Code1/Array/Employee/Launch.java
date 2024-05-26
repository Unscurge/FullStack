package Employee;

public class Launch {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Chaitanya");
        Employee e2 = new Employee(2, "Arjun");
        Employee e3 = new Employee(3, "Shishir");
        Employee e4 = new Employee(4, "Sanket");

        Employee emp[] = new Employee[4];

        emp[0] = e1;
        emp[1] = e2;
        emp[2] = e3;
        emp[3] = e4;

        for (int i = 0; i < 4; i++) {
            System.out.println(emp[i].disp());
        }

    }

}
