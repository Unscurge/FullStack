package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LaunchUnchecked {
    public static void main(String[] args) {
        System.out.println("First Line");

        Scanner sc = new Scanner(System.in);
        try { // used to write risky code (means line of code having a error or not)
            System.out.println("Enter First Number : ");
            int n1 = sc.nextInt();
            System.out.println("Enter Seond Number : ");
            int n2 = sc.nextInt();

            System.out.println(n1 / n2);
        } catch (ArithmeticException A) { // catch is used to handle error is there is any in try where is risky code is
                                          // written
            System.out.println(A.getMessage()); // catch block will not execute if there is no error in try block
            A.printStackTrace();
        } catch (InputMismatchException I)// multiple catch block an be defined for multiple exception handling
        {
            System.out.println(I.getMessage());
            I.printStackTrace();
        } catch (Exception E) // using exception if we dont know what type of error is occuring in try block
        {
            System.out.println(E.getMessage());
            E.printStackTrace();
        }
        System.out.println("Last Line");

        sc.close();
    }
}
