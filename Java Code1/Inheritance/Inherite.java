package Inheritance;

// Inheritance - it is a process where we inherit properties of one class into another class is called as inheritance
// Inheritance represents IS-A relationship
// extends is keyword in java which is used to inherit property of one class inti another
// types-
//1. Single level
//2. multi level
//3. multiple
//4. hierarchical
//5. hybrid
// Java does not supports the multiple inheritance but we can achieve functionality of multiple by using interface
public class Inherite {
    int id;
    String name;
    double sal;
    double exp;

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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }
}
