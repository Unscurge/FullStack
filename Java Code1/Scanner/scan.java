package Scanner;

import java.util.Scanner;

public class scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age : ");
        int age = sc.nextInt();
        System.out.print("Enter name : ");
        String str = sc.nextLine();
        System.out.print("Enter byte : ");
        byte b = sc.nextByte();
        System.out.print("Enter float : ");
        float f = sc.nextFloat();
        System.out.print("Enter double : ");
        double d = sc.nextDouble();
        System.out.print("Enter boolean : ");
        boolean bd = sc.nextBoolean();
        System.out.print("Enter char : ");
        char ch = sc.next().charAt(0);
        sc.close();
    }

}
