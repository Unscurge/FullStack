package AccException;

import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class Launch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 10000;

        System.out.print("Enter Amount to be withdrawn :");
        int amt = sc.nextInt();
        try {
            if (amt < bal) {
                System.out.println("Withdraw Succesfull");
            } else if (amt > bal) {
                throw new InsufficientFundsException("Insuffficient Balance");
            }
        } catch (InsufficientFundsException i) {
            System.out.println(i);
        }
        sc.close();
    }
}
