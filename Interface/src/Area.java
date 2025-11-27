
public class Area implements Shape 
{
	@Override
	public void circlearea(float r)
	{
	 System.out.println("Area of circle"+(PI*r*r));	
	}
	@Override
	public void spherearea(float r)
	{
		System.out.println("Area of sphere"+(4*PI*r*r));	
	}
	public static void main(String[] args) 
	{
		Area ob=new Area();
		ob.circlearea(5.7f);
		ob.spherearea(3.5f);
	}

}
