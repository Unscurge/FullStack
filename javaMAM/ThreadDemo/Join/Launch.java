package ThreadDemo.Join;

public class Launch {
    public static void main(String[] args) {
        JoinDemo t1 = new JoinDemo();
        JoinDemo t2 = new JoinDemo();
        JoinDemo t3 = new JoinDemo();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
    }

}
