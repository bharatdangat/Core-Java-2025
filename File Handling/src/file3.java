import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;

public class file3
{
	public static void main(String[] args)throws Exception
	{
	File f1=new File("C:/HTML-CSS/HTML/first.html");
	FileWriter fw1=new FileWriter(f1);
	//fw1.write("Welcome to HTML Again...");
	System.out.println("Write Sucessfully");
	fw1.close();
	}

}
