package com.ty.first;
public class Test 
{
	void m1(int a,int b)
	{
		if(a>0&&b>0)
		{
			int result=a+b;
			System.out.println("Addition-:"+result);
		}
		else
		{
			System.out.println("Number is Negative..");
		}
	}
	void m2(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args)
	{
	 Test ob=new Test();
	 int arr[]={10,20,30,40,50};
	 ob.m1(20,30);
	 ob.m2(arr);
	}

}
