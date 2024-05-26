package UserInput;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Marks of Student no." + (i + 1) + " : ");
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Marks of student " + (i + 1) + " : " + arr[i]);
        }
        sc.close();
    }
}
