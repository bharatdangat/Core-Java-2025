import java.io.FileOutputStream;
public class file5
{
	public static void main(String[] args)throws Exception
	{
		 FileOutputStream f2=new FileOutputStream("first.txt");
		 System.out.println("Enter Data upto ctrl Z-");
		 int k;
		 while((k=System.in.read())!=-1)
		 {
			 f2.write(k);
		 }
		 f2.close();
		
	}

}
