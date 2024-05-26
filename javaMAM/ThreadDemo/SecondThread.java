package ThreadDemo;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
        try {
            for (int i = 1; i < 11; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getClass());
    }

    public static void main(String[] args) {
        SecondThread s = new SecondThread();
        Thread th = new Thread(s);

        th.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Seed");
        }

    }
}
