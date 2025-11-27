package com.ty.first;
public class Student7
{
	int rno;
	String name;
	double per;
	public Student7(int rno,String name,double per)
	{
	 this.rno=rno;
	 this.name=name;
	 this.per=per;
	}
	void display()
	{
	 System.out.println(rno);
	 System.out.println(name);
	 System.out.println(per);
	 System.out.println("______________");
	 
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Student7 om=new Student7(101,"om",89);
     om.display();
     Student7 sai=new Student7(102,"sai",69);
     sai.display();
     Student7 ram=new Student7(103,"ram",79);
     ram.display();
	}

}
