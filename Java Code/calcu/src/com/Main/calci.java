package com.Main;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) 
	{
		
		
		int x1;
		do {
			System.out.println("1.Add    2.Subtarction    3.Multiply    4.Division");
			
			Scanner obj1 = new Scanner (System.in);	
			System.out.print("Enter Your Choice : ");
			int choice = obj1.nextInt();
			
			System.out.print("Enter First Number : ");
			int num1 = obj1.nextInt();
			System.out.print("Enter second Number : ");
			int num2 = obj1.nextInt();
			
			switch (choice)
			{
			case 1:
				System.out.println("Sum is : "+(num1+num2));
				break;
			case 2:
				System.out.println("Subtraction is : "+(num1-num2));
				break;
			case  3:
				System.out.println("Product is : "+(num1*num2));
				break;
			case 4:
				System.out.println("Division is : "+(num1/num2));
				break;
				default:
					System.out.println("Invalid choice");
			}
			Scanner obj2 = new Scanner (System.in);	
			System.out.print("Enter 0 to continue : ");
			x1 = obj2.nextInt();
			
			
		}while(x1==0);
        
	
		
	}
	
}
