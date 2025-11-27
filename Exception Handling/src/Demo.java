public class Demo
{
	public static void main(String[] args)
	{
	 try
	 {
		 int a=89;
		 System.out.println(a/0);
	 }catch(Exception e)
	 {
		 System.out.println("Error-"+e);
	 }
	}

}
