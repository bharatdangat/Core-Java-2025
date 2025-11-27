package com.ty.first;
public class This 
{
	int rno;
	String name;
	double per;
	public This(int rno, String name, double per)
	{
	 this.rno=rno;
	 this.name=name;
	 this.per=per;
	}
	public static void main(String[] args) 
	{
	 This ob=new This(101,"Aadi",89.9);
	 System.out.println(""+ob.rno);
	 System.out.println(""+ob.name);
	 System.out.println(""+ob.per);
	 
	}

}
