package com.atmapp;
import java.util.*;
public class Demo 
{
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int pin;
  int correctpin=12345;
  char cancontinue=0;
  double balance=100000;
  int attempts=0;
  int ch;
  
  while(attempts<3)
  {
	  System.out.println("Enter Your Pin-:");
	  pin=sc.nextInt();
	 if(pin==correctpin)
	 {
		 System.out.println("----------ATM APP------------");
		 System.out.println("\n1-Check Balance \n2-Deposit \n3-Withdraw \n4Exit");
	 while(cancontinue=='y')
	 {
		 System.out.println("Enter Your Choice-");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Current Balance-:"+balance);
				break;
			case 2:
				System.out.println("Enter Amount to deposit-");
				int deposit=sc.nextInt();
				if(deposit>0)
				{
					balance+=deposit;
					System.out.println("Balance="+balance);
				}
				else
				{
					System.out.println("Amount must be positive..");
				}
				break;
			case 3:
				System.out.println("Enter Amount to deposit-");
				double withdraw=sc.nextDouble();
				if(withdraw>0)
				{
					balance-=withdraw;
					System.out.println("Balance="+balance);
				}
				else
				{
					System.out.println("Amount must be positive..");
				}
				System.out.println("\nDo you want to continue---");
				cancontinue=sc.next().charAt(0);
			}
	 } 
	 }
	 else
	 {
		 System.out.println("\n Incorrect Pin...");
		 attempts ++;
	 }
  }
  if(attempts==3)
  {
	  System.out.println("So Many Atttempts Profile Locked...");
  }
	  
 }
}
