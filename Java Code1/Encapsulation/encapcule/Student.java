package Encapsulation.encapcule;

public class Student {
    int rollNo;
    private String pass;// can be access only within the class.

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private void show() {
        System.out.println("Showing");
    }

    public void sho() {
        show();// accessing private method indirectly through public method.
    }
}
