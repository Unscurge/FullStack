package ifelse;

public class ifelse {
	public static void main (String[] args)
	{
		int age = 66;
		if(age >= 18 && age <60)
		{
			System.out.println("You are Eligible For Driving Licence");
		}
		else if(age<=18)
		{
			System.out.println("You are not Eligible For Driving Licence");
		}
		else
		{
			System.out.println("You are not Eligible (overaged)");
		}
	}
	}


