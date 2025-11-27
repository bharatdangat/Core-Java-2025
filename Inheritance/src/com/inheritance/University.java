package src.com.inheritance;

import java.util.Scanner;

public class University 
{
 int uno;
 String uname;
 void acceptu()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Univrsity no and name");
	 uno=sc.nextInt();
	 uname=sc.next();
	 
 }
}
