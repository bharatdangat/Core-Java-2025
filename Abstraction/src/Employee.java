//abstract class-ddont create ob of abstract class...
abstract class Employee
{
 void login() //also contain non abstract method..
 {
	 System.out.println("Login non abstract method..");
 }
 abstract void addition(int a,int b);
 abstract void substraction(int a,int b);
}
