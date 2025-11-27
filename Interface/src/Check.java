public class Check extends Base implements Integer,Strings
{
	@Override
	public void check(int n)
	{
	 if(n>0)
		 System.out.println("Number is Positive");
	 else
		 System.out.println("Number is Negative");	 
	}
	@Override
	public void checkstring(String s)
	{
	 	System.out.println("I am String-"+s);
	}
	@Override
	void show()
	{
		super.show();
	System.out.println("I am show method of derived classs...");	
	}
	@Override
	public void method()
	{
		System.out.println("I am method of Integer extended interface Demo");
	}
	@Override
	public void display()
	{
		System.out.println("I am method of Integer extended interface Demo extended interface DemoBase...");
	}
	public static void main(String[] args) 
	{
	 Check c=new Check();
	 c.check(3);
	 c.checkstring("Java");
	 c.show();
	 c.method();
	 c.display();
	}

}
