package ifelse;

public class nested {

	public static void main(String[] args) {
		int mrks = 80;
		
		if(mrks >= 60 && mrks < 75)
		{
			System.out.println("Pass With First class");
		}
		else if(mrks>=75 && mrks <=100)
		{
			System.out.println("Pass with Distinction");
			System.out.println("Choose from 1 to 3");
			int choice = 1;
			if(choice == 1)
			{
				System.out.println("Bike");
			}
		}
		else if(mrks>=50&&mrks<=35)
		{
			System.out.println("Pass");
		}
		else if(mrks>35)
		{
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
