import java.io.BufferedReader;
import java.io.FileReader;

//display contents of file in reverse order...
public class file10
{
	public static void main(String[] args)throws Exception
	{
	 FileReader fr=new FileReader("first.txt");
	 BufferedReader br=new BufferedReader(fr);
	 String s1="";
	 while((s1=br.readLine())!=null)
	 {
		 StringBuffer sbr=new StringBuffer(s1);
		 sbr.reverse();
		 System.out.println(sbr);
	 }
	}

}
