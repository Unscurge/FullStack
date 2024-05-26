package Homework.Custom;

public class customer {
    static int empId = 0;
    String name;

    customer(String Name) {
        name = Name;
        empId++;
    }

    static {
        System.out.println("Count before : " + empId);
    }

    public void disp() {
        System.out.println("Id : " + empId);
        System.out.println("Name : " + name);
    }

    static void count() {
        System.out.println("Count after : " + empId);
    }

}
