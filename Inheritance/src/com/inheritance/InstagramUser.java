package src.com.inheritance;
public class InstagramUser extends User 
{
	void showi()
	{
		System.out.println("I am Insta User");
	}
	public static void main(String[] args) 
	{
	 User iu=new InstagramUser(); //upcating
	 //iu.showi();
	 iu.showu(); //only call parent method in dynamic disptach
	}

}
