//using parametrized contructor...
import java.util.*;
public class uDemo 
{
	void checkAge()
	{
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age-");
		int age=sc.nextInt();
		if(age<18)
		{
			//this is  parametrized constructor
			throw new YoungerAgeException("Age is Under 18....");
		}
		else
		{
			System.out.println("You can Vote..");
		}
		}catch(YoungerAgeException e)
		{
			//catch msg through Evception class...
			System.out.println(e);
		}
	}
	public static void main(String[] args)
	{
	 uDemo ob=new uDemo();
	 ob.checkAge();
	}

}
