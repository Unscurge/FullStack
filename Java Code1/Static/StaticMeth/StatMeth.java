package Static.StaticMeth;

public class StatMeth {
    static int empId = 10;// Static Variable

    int xyz = 10;// Cant use in Static method.

    // Satic Methods
    public static void show() {
        System.out.println(empId);
    }
}
