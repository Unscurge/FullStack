package EmpShort;

import java.util.Scanner;

public class Launch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee1 e1 = new Employee1();

        while (true) {
            System.out.print(
                    "Enter 1. Insert\nEnter 2. Read\nEnter 3. Update\nEnter 4. Delete \nEnter 5. Close\n\nYour Choice : ");

            int choice = sc.nextInt();

            if (choice == 1) {
                e1.insert();
            } else if (choice == 2) {
                e1.read();
            } else if (choice == 3) {
                e1.update();
            } else if (choice == 4) {
                e1.delete();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid Input!");
            }
        }
        sc.close();

    }

}
