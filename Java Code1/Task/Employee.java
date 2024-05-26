package Task;

public class Employee {
    static int Id = 0;
    String name;

    Employee() {
        Id++;
    }

    public void setName(String Name) {
        name = Name;
    }

    public void disp() {
        System.out.println("Id : " + Id);
        System.out.println("Name : " + name);
    }

    public static void coun() {
        System.out.println("Count is : " + Id);
    }

}
