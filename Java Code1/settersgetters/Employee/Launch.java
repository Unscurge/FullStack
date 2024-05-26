package settersgetters.Employee;

public class Launch {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.setID(101);
        e1.setName("Rand Arjun");
        e1.setSal(150);
        e1.setexp(10);

        System.out.println("ID = " + e1.getID());
        System.out.println("Name = " + e1.getName());
        System.out.println("Salary = " + e1.getSal());
        System.out.println("Experience = " + e1.getexp());

    }
}
