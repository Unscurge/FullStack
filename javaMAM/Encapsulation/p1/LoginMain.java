package Encapsulation.p1;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginDemo l = new LoginDemo();

        System.out.print("Enter Username : ");
        String un = sc.nextLine();
        System.out.print("Enter PassWord : ");
        int pass = sc.nextInt();
        l.setUsername(un);
        l.setPass(pass);

        if (un.equals("admin") && pass == 123) {
            System.out.println("Welcome" + " " + l.getUsername());
        } else {
            System.out.println("Invalid Credentials");
        }
        sc.close();
    }
}
