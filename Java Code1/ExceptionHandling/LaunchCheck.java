package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LaunchCheck {
    public static void main(String[] args) {
        System.out.println("First Line");

        Scanner sc = new Scanner(System.in);
        try {
            String path = " ";
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {

        }
        System.out.println("Last Line");

        sc.close();
    }
}
