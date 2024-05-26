package AtmSimulator;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Methods m = new Methods();
        while (true) {
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 to Update PIN");
            System.out.println("Choose 5 for EXIT");
            System.out.print("Choose the operation you want to perform : ");

            int choice = sc.nextInt();

            if (choice == 1) {
                m.withdraw();
            }
            if (choice == 2) {
                m.Deposit();
            }
            if (choice == 3) {
                m.check();
            }
            if (choice == 4) {
                m.update();
            }
            if (choice == 5) {
                break;
            }
        }
        sc.close();
    }

}
