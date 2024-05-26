package ConsChain;

public class Temp {
    public Temp() {
        this(1, 101);
        System.out.println("Inside temp constructor");
    }

    public Temp(String name) {
        this("mh", 40);
        System.out.println("Inside temp construtor : " + name);
    }

    public Temp(int id, int roll) {
        this("SEED");
        System.out.println("Inside temp constructor : " + id + " " + roll);
    }

    public Temp(String state, int pin) {
        System.out.println("Inside Temp constructor : " + state + " " + pin);
    }
}
