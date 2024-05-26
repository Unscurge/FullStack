package AccException;

import java.util.Scanner;

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Withdraw 2.Deposit");
        System.out.print("Enter Option : ");
        int opt = sc.nextInt();
        if (opt == 1) {
            System.out.print("Enter amount to be withdrwan : ");
            int amt1 = sc.nextInt();
            try {
                if (amt1 > 0) {
                    System.out.println("Succesfull");
                } else {
                    throw new InvalidAmountException("Invalid Amount");
                }
            } catch (InvalidAmountException i) {
                System.out.println(i);
            }
        } else if (opt == 2) {
            System.out.print("Enter amount to Deposit : ");
            int amt1 = sc.nextInt();
            try {
                if (amt1 > 0) {
                    System.out.println("Succesfull");
                } else {
                    throw new InvalidAmountException("Invalid Amount");
                }
            } catch (InvalidAmountException i) {
                System.out.println(i);
            }
        }
    }

}
