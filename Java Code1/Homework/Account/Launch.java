package Homework.Account;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        acc acc1 = new acc();
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Account Number : ");
        int accno = obj.nextInt();
        System.out.print("Enter Name : ");
        String name = obj.next();
        System.out.print("Money To be Deposited : ");
        double bal = obj.nextDouble();

        acc1.getAccno(accno);
        acc1.getOwnername(name);
        acc1.getBalance(bal);

        System.out.println("Account Number is : " + acc1.setAccno());
        System.out.println("Account Number is : " + acc1.setOwner());
        System.out.println("Account Number is : " + acc1.setbal());
        obj.close();
    }

}
