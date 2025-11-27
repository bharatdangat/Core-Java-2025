package src.com.inheritance;
 class Payment 
{
 
	int amount=1000;
 
}
class Phonepay extends Payment
{
	
	 String sendernm="Adi";
}

public class Gpay extends Phonepay
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	Gpay ob=new Gpay();
	 System.out.println(ob.amount);
	 System.out.println(ob.sendernm);
	}

}
