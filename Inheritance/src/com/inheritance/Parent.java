package src.com.inheritance;
public class Parent 
{
 int id=101;
 Parent()
 {
	 System.out.println("Default Constructor of Parent");
 }
 Parent(int a,int b)
 {
	 int c=a+b;
	 System.out.println("Addition of Parent="+c);
 }
  void show()
 {
	 System.out.println("Parent class method");
 }
}
