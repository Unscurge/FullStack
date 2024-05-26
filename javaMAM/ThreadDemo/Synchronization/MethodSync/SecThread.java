package ThreadDemo.Synchronization.MethodSync;

public class SecThread extends Thread {
MyTable t; // Instance Variable
SecThread(MyTable t) // Local Variable
{
    this.t = t;
}
    public void run(){
        t.printTable(5);
    }
}
