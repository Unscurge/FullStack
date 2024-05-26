package Interface1;

public class Launch {
    public static void main(String[] args) {
        databseImp d = new databseImp();
        d.insert();
        d.read();
        d.update();
        d.delete();
    }
}
