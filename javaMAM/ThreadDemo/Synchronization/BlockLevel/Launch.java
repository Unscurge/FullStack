package ThreadDemo.Synchronization.BlockLevel;

public class Launch {
    public static void main(String[] args) {
        Message obj = new Message();
        MyFirstThread t1 = new MyFirstThread(obj, "Chaitanya");
        MyFirstThread t2 = new MyFirstThread(obj, "Arjun");
        t1.start();
        t2.start();
    }

}
