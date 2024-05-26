package com.MainApp;

import java.util.Scanner;

public class objct {

	public static void main(String[] args) {
		
		/*employee obj=new employee();
		System.out.println(obj.id);
		System.out.println(obj.str);
		System.out.println(obj.sal);*/
			
		
		Scanner obj1 = new Scanner (System.in);	
		System.out.println("Enter username");
		String userName = obj1.nextLine();
		System.out.println("Username is: " + userName);
	}

}
