package src.com.inheritance;

public class State extends Country
{
	String state;
	public State(String state)
	{
		super("india");
	    this.state=state;
	}
	void display()
	{
		System.out.println("Containent="+continame);
		System.out.println("Country="+coname);
		System.out.println("State="+state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 State s=new State("maharshtra");
	s.display();
	}

}