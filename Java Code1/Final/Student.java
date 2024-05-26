package Final;

public final class Student {
    public void disp() {
        System.out.println("Displaying data of student class");
    }
}

class teacher extends Student {// cannot extend because student is Final.

}
