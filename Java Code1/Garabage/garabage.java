package Garabage;

public class garabage {
    int id;
    String name;

    public void finalize() {
        System.out.println("object is deleted");
    }

    public garabage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void disp() {
        System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
    }

}
