import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class file4
{
	public static void main(String[] args)throws Exception
	{
	 FileInputStream f1=new FileInputStream("first.txt");
	 int k;
	 while((k=f1.read())!=-1)
	 {
		 System.out.print((char)k);
	 }
	 f1.close();
	 }
}
