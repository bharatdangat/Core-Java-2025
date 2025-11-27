package com.ty.first;
public class Student5 
{
	Student5()
	{
		
	}
	static String company;
	//static variable of one class can acess in another calss using class name
	int id;
	String name;
	double per;

	
	//instance method....
	void show()
	{
		System.out.println("This is Instance method...");
		System.out.println(company);
		//static variable acess in also instance method..
		System.out.println(id);
		//instance variable acess in  instance method..		
	}
		
	//static method....
    static void calculate()
    {
    	System.out.println("This is Static  Method...");
    	System.out.println(company);
		//static variable acess  in static method 
    	
		System.out.println(new Student5().id);
		//instance variable can not acess in  staic method..dirctly
		//it can acess using class name..
		
    }
    void m1()
    {
      show();
      //one instance method call in another instance method...
      calculate();
      //one static method acess in another instance method..
    }
    static void m2()
    {
    new Student5().show();	
    ////one instance method call in static  method. using class..
    calculate();
    //one static method acesss in another static method..
    }
    
	public static void main(String[] args)
	{
	 Student5.company="TCS";
	 Student5.calculate();
	 //static method call using Class name OR Directly........
	 Student5 om=new Student5();
	 om.show();
	 //instance method call using object.......
	 Student5 sai=new Student5();
	 sai.show();
	 Student5 ram=new Student5();
	}

}

