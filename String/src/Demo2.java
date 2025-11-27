public class Demo2
{
	public static void main(String[] args)
	{
	 StringBuffer s1=new StringBuffer("Adi");
	  System.out.println(""+s1.append("nath"));
	  System.out.println(""+s1.capacity());
	  System.out.println(""+s1.charAt(0));
	  System.out.println(""+s1.indexOf("n"));
	  System.out.println(""+s1.reverse());
	  System.out.println(""+s1.delete(1,4));
	  System.out.println(""+s1.insert(1,"JK"));
	  
	  StringBuilder s2=new StringBuilder("Computer");
	  System.out.println(""+s2.append("Table"));
	  System.out.println(""+s2.insert(8,"Body"));
	  System.out.println(""+s2.replace(4,8,"etition"));
	  System.out.println(""+s2.reverse());
	  
	  
	  
		  
	  
	}

}
