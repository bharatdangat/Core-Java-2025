//copy content of one file into another by line by line..
//(use BufferedReader)

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
public class file11 
{
	public static void main(String[] args)throws Exception
	{
	 FileReader fr=new FileReader("first.txt");
	 FileWriter fw=new FileWriter("second.txt");
	 BufferedReader br=new BufferedReader(fr);
	 BufferedWriter bw=new BufferedWriter(fw);
	 String s1;
	 while((s1=br.readLine())!=null)
	 {
		 bw.write(s1+"\n");
	 }
	 br.close();
	 bw.close();
	 fr.close();
	 fw.close();
	 System.out.println("File copy sucesssfully...");
	}
}
