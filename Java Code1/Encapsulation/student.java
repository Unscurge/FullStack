package Encapsulation;

public class student {
    public int stdId = 101;
    private String pass = "Pass@123";// Private data member can only be access within the class it is declared in.
}

class demo extends student {
    public void disp() {
        System.out.println(super.stdId);
        // System.out.println(super.pass);// showing error because pass data member is
        // private.
    }
}
