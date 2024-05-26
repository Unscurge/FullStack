package ExceptionHandling;

import java.io.FileInputStream;

public class Thorows {
    public static void main(String[] args) {
        Arithmetic a = new Arithmetic();
        try {
            a.fileOperation();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class Arithmetic {
    public void fileOperation() throws Exception {
        FileInputStream fs = new FileInputStream("null");

        String s1 = "Seed";
        System.out.println(s1.charAt(40));

        Class.forName("ExceptionHandling.Thor");
    }

}