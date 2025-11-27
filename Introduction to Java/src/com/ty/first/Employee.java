package com.ty.first;

public class Employee
{
	
	static int salary=9000;//static variable
	int eno; 
	String ename; //instatnce or global variable
	
	static void accept()
	{
		System.out.println("I am Static method ");
		System.out.println("SALARY-"+salary);
	}
	void display()
	{
		System.out.println("I am instance method");
		System.out.println("ENO-"+eno);
		System.out.println("SALARY-"+salary);
		//static var acesss in both mehod but instance var only acess in instatnce method...
	}
	void m2()
	{
	 accept();
	 display();
	}
	
	static void m1()
	{
	 accept();
	 //display();
	}
	//static method acess in both another static and instance method
	//instance mehod only acess in another instance method...
	
	public static void main(String[] args) 
	{
	 Employee ob=new Employee();
	 ob.eno=101;
	 ob.ename="om";
	 System.out.println(ob.eno);
	 System.out.println(ob.ename);
	 System.out.println(ob.salary); //sataic var common for all ob of classs....
	 
	 
	 Employee ob1=new Employee();
	 ob1.eno=102;
	 ob1.ename="sai";
	 System.out.println(ob1.eno);
	 System.out.println(ob1.ename);
	 System.out.println(ob.salary);
	 //static var acess using class name or object and instatnce variable acess using object
	 //static method access using class,object or directly...
	 //ob.accept();
	 //accept();
	 Employee.accept();
	 //instance method accept only  using object..
	 ob1.display();
	 
	
	}

}
