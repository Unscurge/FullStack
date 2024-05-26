package MethodRef;

public class Lanch2 {
    public static void main(String[] args) {
        stuff1 s1 = Student::new;
        stuff2 s2 = Student1::new;
        s1.getStudent();
    }
}

class Student {
    Student() {
        System.out.println("Student Constructor");
    }
}

class Student1{
    Student1(int age){
        System.out.println("Student1 Constructor");
    }
}

interface stuff1 {
    Student getStudent();
}

interface stuff2 {
    Student1 getStudent1();
}
