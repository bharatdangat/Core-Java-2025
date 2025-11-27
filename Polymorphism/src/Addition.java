//method overloading....
public class Addition
{
	//return type may or may not be same
	 void addition(int a,int b)
	{
		 int c=a+b;
		 System.out.println("Addition1-"+c);
	}
	  int addition(int a,int b,int c)
	 {
		 int d=a+b;
		return d; 
	 }
      
      void addition(String a,String b)
      {
 		 String c=a+b;
 		 System.out.println("Addition3-"+c);
  		
  	  }
	void addition(int a,float b)
	{
		 float c=a+b;
		 System.out.println("Addition4-"+c);
	}
	void addition(double a,float b)
	{
		 double c=a+b;
		 System.out.println("Addition5-"+c);
	}
	void addition(int  a, double b)
	{
		 double c=a+b;
		 System.out.println("Addition6-"+c);
	}
	
	public static void main(String[] args)
	{
	 Addition ob=new Addition();
	 ob.addition(11,22);
	 int d=ob.addition(433,19,87);
	 System.out.println("Addition2="+d);
	 ob.addition("om","sai");
	 ob.addition(98, 35.3f);
	 ob.addition(98.87, 35.3f);
	 ob.addition(95, 35.3); 
	}

	
}
