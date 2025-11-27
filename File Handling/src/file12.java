import java.io.FileInputStream;
import java.io.FileOutputStream;

//copy content one file to another while copy change case of character and replace digit by *
public class file12 
{
	public static void main(String[] args)throws Exception
	{
	 FileInputStream f1=new FileInputStream("first.txt");
	 FileOutputStream f2=new FileOutputStream("second.txt");
	 int k;
	 while((k=f1.read())!=-1)
	 {
		 if(Character.isUpperCase(k))
		 {
			f2.write(Character.toLowerCase(k));
		 }
		 else if(Character.isLowerCase(k))
		 {
			f2.write(Character.toUpperCase(k));
		 }
		 else if(Character.isDigit(k))
		 {
			 f2.write('*');
		 }
		 else
			 f2.write(k);
	 }
	 f1.close();
	 f2.close();
	 System.out.println("File copied..");
	}
}
