
//this keyword........

package com.ty.first;
public class Student3 
{
	int id;
	String name;
	double per;
	
	Student3(int id,String name,double per)
	{
		this.id=id; 
		this.name=name;
		this.per=per;
	}
    void display()
    {
    	System.out.println("Roll No-:"+id);
    	System.out.println("Name-:"+name);
    	System.out.println("Per-:"+per);
    	System.out.println("--------------------------");
    }
	public static void main(String[] args)
	{
	 Student3 om=new Student3(101,"om",99.4);
	 om.display();
	 Student3 sai=new Student3(102,"sai",94.4);
	 sai.display();
	 Student3 ram=new Student3(103,"ram",93.4);
	 ram.display(); 
	}

}
