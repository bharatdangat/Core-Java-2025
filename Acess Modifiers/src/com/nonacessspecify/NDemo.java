//#static
package com.nonacessspecify;
import com.nonaessmodify.*;
public class NDemo extends NDemoMain
{
	static int a=10;
	int b=90;
	static void show()
	{
		System.out.println("I am Show method..."+a); //b not possible
	}
	static //static block
	{
		System.out.println("I am Static Block execute before main..");
	}
	
	
	public static void main(String[] args)
	{
	 NDemo ob=new NDemo();
	 System.out.println("Static var-"+NDemo.a);
	 NDemo ob1=new NDemo();
	 System.out.println("Static var 1-"+NDemo.a);
	 NDemo.show();
	// NDemoMain.diplay();  //same pkg only..
	  
	 }

}
