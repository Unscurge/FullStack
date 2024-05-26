package MethodRef;

public class Employee {
    int id;
    String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String string) {
        this.id = id;
        this.name = string;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
