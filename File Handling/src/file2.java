import java.io.File;
import java.io.FileReader;

public class file2
{
	public static void main(String[] args)throws Exception
	{
     File f1=new File("C:/HTML-CSS/HTML/first.html");
     FileReader fr1=new FileReader(f1);
     int k;
     while((k=fr1.read())!=-1)
     {
    	 System.out.print((char)k);
     }
     fr1.close();
	}
}
