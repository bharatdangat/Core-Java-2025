package src.com.inheritance;
public class Child extends Parent
{
	int id=201;
	Child(int a,int b)
	 {
		 super(300,400);
		 //para constructor of parent
		 int c=a+b;
		 System.out.println("Addition of Child="+c);
	 }
	void show()
	{
		super.show();
		System.out.println("Child class Method");
	}
	void m1()
	{
		System.out.println(super.id);
	}
  public static void main(String[] args)
	{
	 Child ob=new Child(100,200);
	 System.out.println(ob.id);
	//[super can not use in static cotent] //System.out.println(super.id;
	 ob.m1(); //acess base class members..
	 ob.show();
	  
	}

}
