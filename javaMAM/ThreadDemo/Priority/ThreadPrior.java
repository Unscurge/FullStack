package ThreadDemo.Priority;

public class ThreadPrior extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadPrior t1 = new ThreadPrior();
        // ThreadPrior t2 = new ThreadPrior();
        // ThreadPrior t3 = new ThreadPrior();

        t1.start();
        System.out.println("Before : " + t1.getPriority());
        t1.setPriority(9);
        System.out.println("After : " + t1.getPriority());

    }

}
