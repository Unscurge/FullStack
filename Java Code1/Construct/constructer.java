package Construct;

public class constructer {
    int Id;
    String Name;
    char Div;

    // Default constructer
    public constructer() {
        System.out.println("default constructer is invoked");
    }

    // Parameterised constructer
    public constructer(int id, String name, char div) {
        Id = id;
        Name = name;
        Div = div;
    }

    public void displayData() {
        System.out.println("Id : " + Id);
        System.out.println("Name : " + Name);
        System.out.println("Div :" + Div);
    }
}
