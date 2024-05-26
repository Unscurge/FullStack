package Interaface;

public class intra implements p1 {
    public static void main(String[] args) {

    }

    @Override
    public void getinfo() {
        System.out.println("Hello");
    }
}

interface p1 {
    void getinfo();

}