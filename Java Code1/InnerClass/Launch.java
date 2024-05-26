package InnerClass;

public class Launch {
    public static void main(String[] args) {
        Outer o = new Outer();// cant access inner class directly.

        Outer.InnerClass i = o.new InnerClass();// accessing inner class.
        i.dips2();
        System.out.println(i.name);
    }
}

class Outer {
    private int data = 10;

    public void disp1() {
        System.out.println("Displaying outr class");
    }

    class InnerClass {
        String name = "Chaitanya";

        public void dips2() {
            System.out.println("Displaying inner class");
            System.out.println(data);// accessing private data member from outer class directly.
        }
    }
}