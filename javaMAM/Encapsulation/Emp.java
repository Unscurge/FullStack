package Encapsulation;

public class Emp {
    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static void main(String[] args) {
        Emp e = new Emp();
        e.setId(101);
        e.setName("Chaitanya");
        e.setCity("Nagpur");
    }

}
