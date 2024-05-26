package Encapsulation;

public class launch {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s.stdId);
        // System.out.println(s.pass);// can not be access since pass is private.
    }
}
