//constructor ovverriding...
public class Demo
{
	Demo()
	{
		this(100,200);
		System.out.println("Deefault constructor...");
	}
	Demo(int a,int b)
	{
		this("Bharat");
		System.out.println("Addition of Int-"+(a+b));
	}
	Demo(String s)
	{
		this(3.45f,5.66f);
     System.out.println("String-"+s);	
	}
	Demo(float a,float b)
	{
		this(3.555,5.444,9.5554);
		System.out.println("Addition of Float-"+(a+b));
	}
	Demo(double  a,double b,double c)
	{
		System.out.println("Addition of Double-"+(a+b));	
	}
	public static void main(String[] args)
	{
	 Demo ob=new Demo();
	}

}
