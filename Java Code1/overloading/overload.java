package overloading;

public class overload {
    /*
     * If one class have multiple methods having same name but different method
     * signature(differ in data type and parameters) is called method overloading.
     */
    public void add(int a, int b) {
        System.out.println("Addition : " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Addition : " + (a + b + c));
    }

    public void add(int a, float b) {
        System.out.println("Addition : " + (a + b));
        ;
    }
}
