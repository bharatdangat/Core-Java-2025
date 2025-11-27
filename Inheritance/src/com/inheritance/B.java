package src.com.inheritance;

import java.nio.channels.ShutdownChannelGroupException;

class A
{
  A()
  {
	  System.out.println("I am Base class...");
  }
  static void show()
  {
	  System.out.println("I am static show method..");
  }
}
public class B extends A //Derived/Child/sub
{
	B()
	{
		 System.out.println("I am Derived  class 1...");	
	}
	public static void main(String[] args) 
	{
     B ob=new B();
     ob.show();
	}

}
