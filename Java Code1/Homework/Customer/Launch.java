package Homework.Customer;

public class Launch {
    public static void main(String[] args) {
        cust c1 = new cust();
        c1.getID(101);
        c1.getName("Chaitanya");
        c1.getPro("Watch");
        c1.getValue(3000);

        System.out.println("Id : " + c1.setID());
        System.out.println("Name : " + c1.setName());
        System.out.println("Product : " + c1.setPro());
        System.out.println("Value : " + c1.setVal());

    }

}
