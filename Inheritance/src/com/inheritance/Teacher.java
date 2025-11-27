//single inheritance.........
package src.com.inheritance;
public class Teacher extends Department
{
	int tno;
	String tname;
	String taddr;
	Teacher(int tno,String tname,String taddr)
	{
		//calling base class para constructor..
		super(101,"science","pune");
		this.tno=tno;
		this.tname=tname;
		this.taddr=taddr;
	}
	void display()
	{
		System.out.println("Dept no="+dno);
		System.out.println("Dept name="+dname);
		System.out.println("Dept addr="+addr);
		System.out.println("Teach no="+tno);
		System.out.println("Teach name="+tname);
		System.out.println("Teach add="+taddr);
	}
	public static void main(String[] args) 
	{
	  Teacher t=new Teacher(1,"wamane","thane");
	  t.display();
	  
	}

}
