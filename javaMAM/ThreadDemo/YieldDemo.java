package ThreadDemo;

public class YieldDemo extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            
        }
    }

    public static void main(String[] args) {
        YieldDemo ye = new YieldDemo();
        ye.start();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Chaitanya");
            Thread.yield();
        }
    }

}
