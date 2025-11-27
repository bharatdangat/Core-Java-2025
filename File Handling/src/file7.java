//cnt spaces,char and digit from file..
import java.io.FileInputStream;
public class file7
{
	public static void main(String[] args)throws Exception
	{
	 FileInputStream f1=new FileInputStream("first.txt");
	 int d=0,s=0,c=0;
	 int k;
	 while((k=f1.read())!=-1)
	 {
		 if(k>='0'&&k<='9')
		 {
			 d++;
		 }
		 if((k>='A'&&k>='Z')||(k>='a'&&k>='z'))
		 {
			 c++;
		 }
		 if(k==' ')
		 {
			 s++;
		 }
	 }
	 System.out.println("Number of Character-"+c);
	 System.out.println("Number of Digit-"+d);
	 System.out.println("Number of spaces-"+s);
	}

}
