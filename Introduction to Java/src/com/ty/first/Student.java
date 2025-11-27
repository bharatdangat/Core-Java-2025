package com.ty.first;
public class Student 
{
	int id;
	String name;
	float per;
	public static void main(String[] args)
	{
	 Student om=new Student();
	 om.id=101;
	 om.name="om";
	 om.per=89;
	 System.out.println(om.id);
	 System.out.println(om.name);
	 System.out.println(om.per);
	 
	 Student sai=new Student();
	 sai.id=102;
	 sai.name="sai";
	 sai.per=84;
	 System.out.println(sai.id);
	 System.out.println(sai.name);
	 System.out.println(sai.per);
	 
	 Student ram=new Student();
	 ram.id=103;
	 ram.name="ram";
	 ram.per=88;
	 System.out.println(ram.id);
	 System.out.println(ram.name);
	 System.out.println(ram.per);
	 
	}

}
