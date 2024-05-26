package settersgetters;

public class Launch {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setStdID(7066);
        s1.setName("Chaitanya");
        s1.setDiv('C');
        s1.setYear(2023);

        System.out.println("ID = " + s1.getStdID());
        System.out.println("Name = " + s1.getName());
        System.out.println("Div = " + s1.getDiv());
        System.out.println("Year = " + s1.getYear());

        student s2 = new student();
        s2.setStdID(7067);
        s2.setName("Arjun");
        s2.setDiv('C');
        s2.setYear(2023);

        System.out.println("ID = " + s2.getStdID());
        System.out.println("Name = " + s2.getName());
        System.out.println("Div = " + s2.getDiv());
        System.out.println("Year = " + s2.getYear());
    }

}
