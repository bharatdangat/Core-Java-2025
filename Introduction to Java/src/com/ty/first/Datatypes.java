package com.ty.first;
import java.util.*;
public class Datatypes
{
	String name;
	char bg;
	void accept()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Employee name-");
		 name=sc.nextLine();
		 System.out.println("Enter Employee Blood Group-");
		 bg=sc.next().charAt(0);
	}
	void display()
	{
		System.out.println("\n Employee name="+name);
		System.out.println("\n Employee Blood Group="+bg);
	}
	public static void main(String[] args) 
	{
	 Datatypes ob=new Datatypes();
	 ob.accept();
	 ob.display();
	}

}
