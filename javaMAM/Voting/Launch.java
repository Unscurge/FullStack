package Voting;

import java.util.Scanner;

class YoungerAgeException extends Exception {
    YoungerAgeException(String NotAllowed) {
        super(NotAllowed);
    }

}

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        try {
            if (age >= 18) {
                System.out.println("Allowed");
            } else if (age < 18) {
                throw new YoungerAgeException("You are not Eligible");
            }
        } catch (YoungerAgeException y) {
            System.out.println(y);
        }
        sc.close();
    }
}
