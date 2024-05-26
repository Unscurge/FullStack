package MethodRef;

public class Launch {
    public static void main(String[] args) {
        Demo obj = new Demo();
        stuff s = obj::temp;

        s.doTask();
    }

}

class Demo {
    void temp() {
        System.out.println("World");
    }
}

interface stuff {
    void doTask();
}
