//method ovverriding- Base calss&Derived class Method Signature(method name,return type,paramrter) is Same 
public class B extends A
{
	@Override
	void addition(int a, int b) 
	{
		super.addition(34,56);
	 int c=a+b;
	 System.out.println("Addition of B-"+c);
	}
	public static void main(String[] args) 
	{
      B ob=new B();
      ob.addition(23,45);
      }
}
