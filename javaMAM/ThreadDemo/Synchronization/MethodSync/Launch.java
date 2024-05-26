package ThreadDemo.Synchronization.MethodSync;

public class Launch {
    public static void main(String[] args) {
        MyTable m = new MyTable();
        FirstThread t1 = new FirstThread(m);
        SecThread t2 = new SecThread(m);

        t1.start();
        t2.start();
    }

}
