//2DArray
package com.ty.first;
public class Student8
{
	int[][] demo(int numbers[][])
	{
		System.out.println("Returned Array as Follows-");
	    return numbers;	
	}
	public static void main(String[] args)
	{
	 Student8 ob=new Student8();
	 int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	 int numbers[][]=ob.demo(a);
	for(int[] number:numbers)
	{
		for(int num:number)
		{
			System.out.print(" "+num);
		}
	}
	}

}
