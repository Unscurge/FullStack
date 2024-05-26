package ThreadDemo.Synchronization.BlockLevel;

public class Message {
    public void show(String name)
    {
        synchronized(this){
            for(int i =1;i<=5;i++)
        {
            System.out.println("How are You " + name);
        }
        }
        
    }
    
}
