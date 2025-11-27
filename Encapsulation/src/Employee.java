public class Employee
{
	int eno;
	String name;
	float sal;
	
	public int getEno()
	{
		return eno;
	}

	public void setEno(int eno)
	{
		if(eno>100)
		{
		this.eno = eno;
		}
		else
		{
			System.out.println("Invalid Emp No........");
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getSal()
	{
		return sal;
	}

	public void setSal(float sal) 
	{
		if(eno>100&&sal>1000)
		{
		this.sal = sal;
		}
		else
		{
			System.out.println("Invalid details...");
		}
	}

	public static void main(String[] args)
	{
	 Employee ob=new Employee();
	 ob.setEno(101);
	 System.out.println("Employee No-"+ob.getEno());
	 ob.setName("Adi");
	 System.out.println("Employee Name-"+ob.getName());
	 ob.setSal(3000f);
	 System.out.println("Employee Sal-"+ob.getSal());
	}

}
