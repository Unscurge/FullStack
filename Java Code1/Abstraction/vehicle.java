package Abstraction;

public abstract class vehicle {
    public void disp()// non abstract method.
    {
        System.out.println("Displaying");
    }

    public abstract void start();// abstract method.
}
