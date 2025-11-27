package com.ty.first;
import java.util.Scanner;
public class SwitchCase
{
	public static void main(String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 int a=100;
	int b=25;
	int ch;
	System.out.println("1-Add 2-Sub 3-Multi 4-Div");
	 do{
	 System.out.println("Enter Choice-");
	 ch=sc.nextInt();
	 switch(ch)
	 {
	 case 1:System.out.println("Add="+(a+b));
		   break;
	 case 2:System.out.println("Sub="+(a-b));
		    break;
	 case 3:System.out.println("Mul="+(a*b));
		    break;
	 case 4:System.out.println("Div="+(a/b));
		    break;
	 }
	}while(ch<5);
	}
}
