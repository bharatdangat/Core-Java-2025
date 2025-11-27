import java.lang.reflect.Array;
//pass Array to method && return array from method...
public class Demo2
{
	int[] m1(int a[])
	{
		return a;
	}
	public static void main(String[] args)
	{
	 Demo2 ob=new Demo2();
	 int a[]={10,20,30,40,50,60};
     int arr[]=ob.m1(a);
     System.out.println("Array-");
     for(int val:arr)
     {
    	 System.out.println(val);
     }
	}

}
