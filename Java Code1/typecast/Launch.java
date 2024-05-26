package typecast;

public class Launch {
    public static void main(String[] args) {
        Employee ref = new Manager();
        Manager m = (Manager) ref; // Typecasting (down casting)
        System.out.println(m.a);
        System.out.println(m.b);
    }
}
