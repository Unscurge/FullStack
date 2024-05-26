package Final;

public class student1 {
    public void display() {
        System.out.println("Displaying data of student class");
    }

    public final void dowork() {
        System.out.println("Method overriding");
    }
}

class Teacher extends student1 {
    public void dowork()// con not override since dowork method is final. Stopped overriding of dowork
                        // method.
    {

    }
}
