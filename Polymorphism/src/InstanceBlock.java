//Instance Block execute before constructor...
public class InstanceBlock 
{
	InstanceBlock()
	{
		System.out.println("I am Constructor...");
	}
	
	{
		System.out.println("I am Instatnce Block...");
	}
	public static void main(String[] args)
	{
		InstanceBlock i=new InstanceBlock();
	}

}
