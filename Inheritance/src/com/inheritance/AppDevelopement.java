//method overriding=coding=> function same in all clsess but only call derived class function...
//super is used to call base class method..
package src.com.inheritance;
public class AppDevelopement extends WebDevlopement
{
	String coding(String language)
	 {
		 String language2=super.coding("Python");
		 System.out.println(language2);
		 System.out.println("AppDevelopement Require Coding..");
	     return language;
	 }

	public static void main(String[] args)
	{
	 AppDevelopement ob=new AppDevelopement();
	 String language3=ob.coding("Flutter");
	 System.out.println(language3);
	}

}
