//Turnsry Operator...........
package com.ty.first;
import java.util.*;
public class Operators
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Age-:");
	 int age=sc.nextInt();
	 String result=(age>18)? "Eligible For Voting":"No Eligible For Voting......"; 
	 System.out.println(result);
	 
	 String s1=(10<20)? "Hi":"Hello";
	System.out.println(s1);
	}

}
