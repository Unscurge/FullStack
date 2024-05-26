package Encapsulation.encapcule;

public class Launch {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setPass("Pass@123");
        System.out.println(s.getRollNo());
        ;
        System.out.println(s.getPass());// Private data member can be accessed indirectly using public method used to
                                        // access private data member wihtin the same class.- Encapsulation.
        s.sho();// accessing Private method.
    }
}
