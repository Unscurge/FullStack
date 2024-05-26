package ThreadDemo;

public class FirstThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());// to find current thread
        System.out.println(Thread.currentThread().getClass());// to find which class contain this thread
        System.out.println("This is Run Method of FirstThread Class");
    }

    public static void main(String[] args) {
        FirstThread fc = new FirstThread();
        fc.start();
        System.out.println(Thread.currentThread().getName());

    }
}
