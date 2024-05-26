package ThreadDemo.Synchronization.BlockLevel;

public class MyFirstThread extends Thread {
    Message m;
    String name;
    MyFirstThread( Message m, String name)
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
