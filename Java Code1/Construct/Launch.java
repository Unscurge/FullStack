package Construct;

public class Launch {
    public static void main(String[] args) {
        constructer s1 = new constructer(1, "Chaitanya", 'C');// Calling Parameterised constructer
        constructer s2 = new constructer();// Calling Default constructer
        s1.displayData();
        s2.displayData();
    }

}
