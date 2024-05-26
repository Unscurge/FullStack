package Encapsulation.m1;

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setResult("75");
        s.setName("Chaitanya");
        System.out.println(s.getRollNo() + "\n" + s.getName() + "\n" + s.getResult());
    }
}
