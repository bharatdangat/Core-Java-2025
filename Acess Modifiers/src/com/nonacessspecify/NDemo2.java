//final-
package com.nonacessspecify;
import com.nonaessmodify.*;
class ND
{
	 final void addition(int a,int b)
	 {
		 System.out.println("Addition-"+(a+b));
	 }
	
}
final class NDemo2 extends ND//final class is not parent of another class(unfertilized parent..)
{
	final double PI=3.14;  //final var have fix value;
	 NDemo2() //can not make constructor as final..
	{
	}
	 /*@Override -final method not ovverride
	 final void addition(int a,int b)
	 {
		 System.out.println("Addition-"+(a+b));
	 }*/
	
	public static void main(String[] args)
	{
	 NDemo2 ob=new NDemo2();
	}

}
