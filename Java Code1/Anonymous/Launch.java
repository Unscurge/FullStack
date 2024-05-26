package Anonymous;

public class Launch {
    public static void main(String[] args) {
        demo d = new demo() {// making object of interface directly.
            public void dowork() {
                System.out.println("Doing Work!");// calling abstract method without helper class(anonymous
                                                  // class/interface).
            }
        };
        d.dowork();

        demo1 d1 = new demo1() {
            public void disp() {
                System.out.println("Displaying");// (anonymous inner class)
            }
        };
        d1.disp();
    }
}

interface demo {
    public void dowork();
}

class demo1 {
    public void disp() {

    }
}