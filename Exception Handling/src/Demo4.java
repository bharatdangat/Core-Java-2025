//finaly permanat execution block..
public class Demo4
{
	public static void main(String[] args)
	{
	 try
	 {
		String s1="pa1";
		int n=Integer.parseInt(s1);
		System.out.println("value-"+n);
	 }catch(Exception e)
	 {
		 System.out.println("Error-"+e);
	 }
	 finally
	 {
	  System.out.println("I am Finally Block..This Block always execute error occur or not...");
	  int a=10;
	  System.out.println("A-"+a);
	 }
	}

}
