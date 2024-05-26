package ThreadDemo.Synchronization.MethodSync;

public class MyTable {
    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + (n * i) );
        }
    }

}
