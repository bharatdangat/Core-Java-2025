//Display each word in file in reverse order..
import java.io.BufferedReader;
import java.io.FileReader;
public class file9
{
	public static void main(String[] args)throws Exception
	{
		FileReader fr=new FileReader("first.txt");
		 BufferedReader br=new BufferedReader(fr);
		 String s1=" ";
		 while((s1=br.readLine())!=null)
		 {
			 String s2[]=s1.split(" ");
			 for(int i=0;i<s2.length;i++)
			 {
				 StringBuffer sb=new StringBuffer(s2[i]);
				 sb.reverse();
				 System.out.print(sb+" ");
			 }
			System.out.println(); 
		 }
		 br.close();
		 fr.close();		 
	}

}
