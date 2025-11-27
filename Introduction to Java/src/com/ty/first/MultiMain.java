package com.ty.first;
public class MultiMain
{
	//write main method as final...
	final public  static void main(String[] args)
	{
		//JVM not call main method as private only use public
       System.out.println("Good Morning....");
       int a[]={1,2,3,4};
       main(a);//JVM call only one main method hence second main call inside first main..
	     //we(programmers) can call main as private method
	}
	final private static void main(int[] args) 
	{
	 System.out.println("Good Night..");	
	}

}
