package com.acessspecify;
public class DemoMain
{
 public int a=100;
 private int b;
 protected int c=300;
 public DemoMain( final int p)
 {
  System.out.println(""+p);
 }
 private DemoMain()
 {
	 
 }
 protected DemoMain(String msg)
 {
	System.out.println(msg); 
 }
 private void d1()
 {
	 
 }
 public void show()
 {
	 //we use only final acess modifiers inside method..
	 final int a=44;
	 System.out.println("I am Show Method...");
 }
 protected void display()
 {
	 System.out.println("Display method of protrcted class...");
 }
 }
