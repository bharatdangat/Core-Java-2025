package src.com.inheritance;
import java.util.*;
public class School extends University
{
 int sno;
 String sname;
 void accepts()
	{
	 super.acceptu();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Scholl no and name");
	 sno=sc.nextInt();
	 sname=sc.next();
	}
	void displays()
	{
	System.out.println("University No-"+uno);
	System.out.println("University Name-"+uname);	
	 System.out.println("School No-"+sno);
	 System.out.println("School Name-"+sname);
	}
	
}
