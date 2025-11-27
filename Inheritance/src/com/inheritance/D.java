package src.com.inheritance;
class Adi
{
  Adi()
  {
	  System.out.println("Defalut construct of Adi");
  }
}
class Bharat extends Adi
{
	Bharat()
	{
		System.out.println("Defalut construct of Bharat");
	}
}
class Chetan extends Bharat
{
 	Chetan()
 	{
 		System.out.println("Defalut construct of Chetan");	
 	}
}
public class D extends Chetan 
{
 D()
 {
	 System.out.println("Defalut construct of D");
 }
	public static void main(String[] args)
	{
	 D ob=new D();
	}

}
