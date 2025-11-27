//copy content one file to another
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class file6
{
	public static void main(String[] args)throws Exception
	{
     FileInputStream f1=new FileInputStream("first.txt");
     FileOutputStream f2=new FileOutputStream("second.txt");
     int k;
     while((k=f1.read())!=-1)
     {
    	 f2.write((char)k);
     }
     f1.close();
     f2.close();
     System.out.println("File copy succ..");
	}
}
