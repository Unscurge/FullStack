package Constructor;

public class Launch {
    public static void main(String[] args) {
        empCompare e = Employee::new;// Constructor refference
        System.out.println(e.getInfo(101, "Chaitanya", "Nagpur"));

    }

}
