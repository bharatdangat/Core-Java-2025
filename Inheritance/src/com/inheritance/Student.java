package src.com.inheritance;
 public class Student //extends Object 
 {
  int rno;
  String name;
  double per;
  String address;
  int age;
  void study()
  {
	  System.out.println("Student can study");
  }
  void sleep()
  {
	  System.out.println("Student sleeping");
  }
  void gym()
  {
	  System.out.println("Student going to the gym");
  }
  void eat()
  {
	  System.out.println("Student is eating food");
  }
  void show()
  {
	  System.out.println("Student Roll No-"+rno);
	  System.out.println("Student Name-"+name);
	  System.out.println("Student Per-"+per);
	  System.out.println("Student Address-"+address);
	  System.out.println("Student Age-"+age);
  }
 }

