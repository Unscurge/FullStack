package Interface1;

public class databseImp implements database {

    @Override
    public void insert() {
        System.out.println("Inserted");
    }

    @Override
    public void read() {
        System.out.println("Read");
    }

    @Override
    public void update() {
        System.out.println("Updated");
    }

    @Override
    public void delete() {
        System.out.println("Deleted");
    }

}
