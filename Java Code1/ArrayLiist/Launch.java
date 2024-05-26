package ArrayLiist;

import java.util.ArrayList;

public class Launch {
    public static void main(String[] args) {
        ArrayList<Employee> esl = new ArrayList<>();
        Employee e = new Employee();
        e.setName("Chaitanya");
        e.setSal(500);
        esl.add(e);

        Employee e1 = new Employee();
        e1.setName("Shishir");
        e1.setSal(150);
        esl.add(e1);

        for (int i = 0; i < esl.size(); i++)// Getting data with for loop.
        {
            System.out.println(esl.get(i).getName());
            System.out.println(esl.get(i).getSal());
        }
        for (Employee i : esl) { // getting data with forEach loop.
            System.out.println(i.getName());
            System.out.println(i.getSal());
        }
    }
}

class Employee {
    int sal;
    String name;

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}