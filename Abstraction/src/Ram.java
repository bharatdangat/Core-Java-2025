
public class Ram extends Adi
{
	@Override
	public void login() //(abstractt method of abstract class is public hence)
	{
	 System.out.println("Ovverride login method of Ram");	
	}
	public static void main(String[] args) 
	{
	 Ram r=new Ram();
	 r.login();
	}

}
