package AtmSimulator;

import java.util.Scanner;

public class Methods {
    Scanner sc = new Scanner(System.in);
    static double balance = 10000;
    static int pinNo = 1941;

    public void Deposit() {
        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();
        if (pin == pinNo) {
            System.out.print("Enter money to be deposited:");
            double deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("Money Deposited succefully! \n");
        } else {
            System.out.println("Invalid Pin! \n");
        }
    }

    public void withdraw() {
        System.out.print("Enter PIN : ");
        int pin = sc.nextInt();
        if (pin == pinNo) {
            System.out.print("Enter amount : ");
            double widraw = sc.nextDouble();
            if (balance >= widraw) {
                balance = balance - widraw;
                System.out.println("Please collect your cash. \n");
            } else {
                System.out.println("Insufficient Balance! \n");
            }
        } else {
            System.out.println("Invalid Pin! \n");
        }
    }

    public void check() {
        System.out.println("Balance : " + balance);
    }

    public void update() {
        System.out.print("Enter Old PIN : ");
        int pin = sc.nextInt();
        if (pin == pinNo) {
            System.out.print("Enter New Four digit PIN : ");
            int pn = sc.nextInt();
            pinNo = pn;
            System.out.println("PIN updated succesfully! \n");
        } else {
            System.out.println("Invalid PIN! ");
        }
    }
}
