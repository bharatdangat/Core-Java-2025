
public interface Employee
{
	 //int a=90;   not allowed instance(but it is by default public static final)
	 int d=90;
	 //Employee(){} not alloewd
	 //void show(){}; not allowed
	static int a=10;
	final int b=20;
	
	static void show()
	{
		System.out.println("I am static method..allow after 1.8");
	}
	default void display()
	{
		System.out.println("I am default method..allow after 1.8");	
	}
	void Abmethod();
 //Abstract mehods not static methods(static method not ovverride..)
  long salary(long salary); //by default public & abstract
//Interface only contains methods of abstract type...
  
}
