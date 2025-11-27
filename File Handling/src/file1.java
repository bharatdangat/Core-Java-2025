//File Class....
import java.io.*;
public class file1
{
	public static void main(String[] args)throws Exception
	{
	 File f1=new File("C:/HTML-CSS/CSS");
	 if(f1.createNewFile())
	 {
		 System.out.println("File will Be Created -"+f1.getName());
	 }
	 else
	 {
		 System.out.println("File Will Be Aredy exist....");
	 }
	
	 if(f1.exists())
	 {
		 System.out.println("File will Be Found");
	 }
	 else
	 {
		 System.out.println("File Will Be not found...");
	 }
	 if(f1.isFile())
	 {
		 System.out.println("This Is File");
	 }
	 else if(f1.isDirectory())
	 {
		 System.out.println("This is Directory");
	 }
	 if(f1.canRead()&&f1.canWrite())
	 {
		 System.out.println("File will Be Radable/writable");
	 }
	 else
	 {
		 System.out.println("File Will Be not Readable/writable...");
	 }
	
	 if(f1.isDirectory())
	 {
		 System.out.println("All Files in Directory....");
		 String s1[]=f1.list();
		 for(String name:s1)
		 {
			 if(name.endsWith(".css"))
			 {
			 System.out.println(name);
			 }
		 }
	 }
	 
	 System.out.println("File Name-"+f1.getName());
	 System.out.println("File Path-"+f1.getAbsolutePath());
	 System.out.println("File Length-"+f1.length());
	 /*f1.delete()-To delete File..*/
	 
	}

	}
