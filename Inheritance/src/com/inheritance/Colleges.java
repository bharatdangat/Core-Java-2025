//Heirracrchical Inheritance...
package src.com.inheritance;
import java.util.Scanner;

public class Colleges extends University
{
	int cno;
	String cname;
	void acceptc()
	{
		super.acceptu();
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter College no and name");
		  cno=sc.nextInt();
		  cname=sc.next();
		  //vvvimp not give datatype again it willl use only once
	}
	void displayc()
	{
		System.out.println("University No-"+uno);
		System.out.println("University Name-"+uname);	
		 System.out.println("College No-"+cno);
		 System.out.println("College Name-"+cname);
			
	}
	public static void main(String[] args) 
	{
	 School s=new School();
	 s.accepts();
	 s.displays();
	 Colleges c=new Colleges();
	 c.acceptc();
	 c.displayc();
	}

}
