
public class Company implements Employee
{
	@Override
	public long salary(long salary)
	{
		return salary;
	};
	@Override
	public void Abmethod() 
	{
		System.out.println("I am abstract method...........");
	};
	public static void main(String[] args)
	{
	 Company ob=new Company();
	 long salary=ob.salary(90000000L);
	 ob.Abmethod();
	 System.out.println("Salary-"+salary);
	 System.out.println("static var"+Employee.a); //Company.a  or direct
	 System.out.println("final var"+Company.b); //Emplyoee.b or direct
	 System.out.println("public var /static/final var"+d);
	 Employee.show(); //Company.show(); && ob.show() not allowd
	 ob.display(); //Employee.display(); && Company.display(); not allowed
 	 //Employee ob1=new Company();  allowed
	 
	 
	}

}
