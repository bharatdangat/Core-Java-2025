//Accept n employee info aand display..(we use AOO)
import java.util.*;
public class Demo6
{
	int eno;
	String name;
	float sal;
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp No-");
		 eno=sc.nextInt();
		System.out.println("Enter Emp Name-");
		 name=sc.next();
		System.out.println("Enter Emp Sal-");
		 sal=sc.nextFloat();		
	}
	void display()
	{
		System.out.println("Emp No-"+eno);
		System.out.println("Emp Name-"+name);
		System.out.println("Emp Sal-"+sal);
		
		System.out.println("");
	}
	public static void main(String[] args)
	{
	 Demo6 ob[]=new Demo6[100];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Limit-");
	 int n=sc.nextInt();
	 for(int i=0;i<n;i++)
	 {
		 ob[i]=new Demo6();
		 ob[i].accept();
	 }
	 for(int i=0;i<n;i++)
	 {
		 ob[i].display();
	 }
	}

}
