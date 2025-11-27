
public class Sai extends Sham
{
	@Override
	public void login() 
	{
		super.login();
		System.out.println("Ovverride login method of Sai");

	}
	public static void main(String[] args) 
	{
     Sai sa=new Sai();
     sa.login();
	}

}
