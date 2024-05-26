package Final;

public class Launch {
    public static void main(String[] args) {
        final float pi = 13.25f;
        // pi = 35.43f;// Can not modify because of final. can not reassign. Final
        // stoped modification.

        System.out.println(pi);
        teacher t = new teacher();
        // t.disp(); - since student class is Final so teacher class cannot extend
        // Student.
    }
}
