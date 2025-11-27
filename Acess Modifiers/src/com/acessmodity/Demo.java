//#public ,private,protected-
package com.acessmodity;
import com.acessspecify.*; //import karana padata he...
public class Demo extends DemoMain
{
	private int b=200;
	public Demo()
	{
		super(500);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
	 Demo ob=new Demo();
	 System.out.println("Public Var-"+ob.a);
	 System.out.println("Private Var-"+ob.b);
	 ob.show();
	 //DemoMain ob1=new DemoMain();
	 //ob.d1(); not possible...
	 System.out.println("Protected Var-"+ob.c);
	 ob.display();
	 //not possible-DemoMain dm=new DemoMain("protected constructor");
	}

}
