//2D Array-int a[][]=new int[10][10];
public class Demo3
{
	int[][] m1(int a[][])
	{
		return a;
	}
	public static void main(String[] args)
	{
	 Demo3 ob=new Demo3();
     int a[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
     int arr[][]=ob.m1(a);
	 System.out.println("2D Arrray-:");
     for(int val[]:arr)
	 {
		 for(int value:val)
		 {
			 System.out.println(value);
		 }
	 }
	}

}
