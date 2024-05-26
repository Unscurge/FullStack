package ThreadDemo.Join;

public class JoinDemo extends Thread {
    public void run()
    {
        for(int i =0;i<=5;i++)
        {
            System.out.println(i + "\t" + Thread.currentThread().getName());
        }
    }
}
