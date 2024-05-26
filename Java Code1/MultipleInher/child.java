package MultipleInher;

public class child implements parent1, parent2 {

    @Override
    public void show() {
        System.out.println("Showing");
    }

    @Override
    public void doWork() {
        System.out.println("Doing work");
    }

}
