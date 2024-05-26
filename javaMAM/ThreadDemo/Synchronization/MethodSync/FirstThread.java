package ThreadDemo.Synchronization.MethodSync;

public class FirstThread extends Thread {
    MyTable t; // Instance Variable

    FirstThread(MyTable t) // Local Variable
    {
        this.t = t;
    }

    public void run() {
        t.printTable(7);
    }
}
