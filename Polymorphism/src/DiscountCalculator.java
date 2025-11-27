//static method ovverloading..........(static method not ovverride....)
public class DiscountCalculator
{
	static double c;
	static double calculateprice(double price)
	{
		return price;
	}
	static double calculateprice(double price,double discount)
	{
		return price-price*discount/100;
	}
	static double calculateprice(double price,String promocode)
	{
		if(promocode.equals("SAVE100"))
		{
			return price-100;
		}
		else if(promocode.equals("SAVE500"))
		return price-500;
	return price;
	}
	
	public static void main(String[] args)
	{
	 DiscountCalculator dc=new DiscountCalculator();
	   c=DiscountCalculator.calculateprice(800.50); //static method..
	  System.out.println(c);
	   c=DiscountCalculator.calculateprice(800.50,10); 
	  System.out.println(c);
	   c=DiscountCalculator.calculateprice(800.55,"SAVE100");  
	}

}
