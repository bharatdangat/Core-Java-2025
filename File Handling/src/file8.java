import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;

public class file8
{
	public static void main(String[] args)throws Exception
	{
	 FileReader fr=new FileReader("first.txt");
	 BufferedReader br=new BufferedReader(fr);
	 String s1;
	 while((s1=br.readLine())!=null)
	 {
		 System.out.println(s1);
	 }
	 br.close();
	 
	}

}
