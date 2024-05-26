package com.Calculator;
import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		System.out.println("1.Add    2.Substarct    3.Multiply    4.Division");
		
		Scanner obj1 = new Scanner (System.in);	
		System.out.println("Enter Your Choice : ");
		String Choice = obj1.nextLine();
		
		System.out.println("Enter First Number : ");
		int num = obj1.nextInt();
	}

}
