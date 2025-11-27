package src.com.inheritance;
public class CollegeStudent extends Student
{
	String stream;
	String HOD;
	String university;
	String college;
	void showClg()
	{
	 show();
	 System.out.println("Stream-"+stream);
	 System.out.println("HOD-"+stream);
	 System.out.println("University-"+university);
	 System.out.println("College-"+college);	 
	 System.out.println("-----------------------");	 
	 
	}
	void farewell()
	{
		System.out.println("Frewell");
	}
	
	void Placement()
	{
		System.out.println("Placement");
	}
	
	void Internship()
	{
		System.out.println("Internship");
	}
	public static void main(String[] args)
	{
	 CollegeStudent ob1=new CollegeStudent();
	 ob1.rno=101;
	 ob1.name="om";
	 ob1.per=89.78;
	 ob1.address="pune";
	 ob1.age=21;
	 ob1.college="RBNB";
	 ob1.HOD="Shinde Sir";
	 ob1.stream="science";
	 ob1.university="SPPPU";
	 ob1.study();
	 ob1.sleep();
	 ob1.gym();
	 ob1.eat();
	 ob1.farewell();
	 ob1.Placement();
	 ob1.Internship();
	 ob1.showClg();
	 CollegeStudent ob2=new CollegeStudent();
	 ob1.rno=102;
	 ob1.name="sai";
	 ob1.per=43.45;
	 ob1.address="thane";
	 ob1.age=16;
	 ob1.college="CDJ";
	 ob1.HOD="unde Sir";
	 ob1.stream="commerce";
	 ob1.university="SPPPU";
	 ob1.study();
	 ob1.sleep();
	 ob1.gym();
	 ob1.eat();
	 ob1.farewell();
	 ob1.Placement();
	 ob1.Internship();
	 ob1.showClg();
	}

}
