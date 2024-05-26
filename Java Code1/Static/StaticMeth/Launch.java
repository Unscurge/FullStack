package Static.StaticMeth;

public class Launch {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.dowork();
        Employee e2 = new Employee();
        e2.dowork();
        StatMeth.show();// Static Method Calling.

    }

}
