package com.nonaessmodify;

public class NDemoMain {
//static int d=130;-class level var..
static void display()
{
	System.out.println("I am Display method of another class..");
}

static class InnerNDemoMain //static inner class..
{
	void innermethod()
	{
		System.out.println("I am Inner class and that can be acess outside pkg");
	}
}
}

