package Homework.Customer;

public class cust {
    int custID;
    String custName;
    String product;
    double value;

    public void getID(int ID) {
        custID = ID;
    }

    public void getName(String name) {
        custName = name;
    }

    public void getPro(String Pro) {
        product = Pro;
    }

    public void getValue(double Val) {
        value = Val;
    }

    public int setID() {
        return custID;
    }

    public String setName() {
        return custName;
    }

    public String setPro() {
        return product;
    }

    public double setVal() {
        return value;
    }
}
