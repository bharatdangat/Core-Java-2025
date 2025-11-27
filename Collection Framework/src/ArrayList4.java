//Accept  n itegers from user and store them in array list collection and display elements in reverse order..
import java.util.*;
public class ArrayList4 
{
 public static void main(String[] args) {
	ArrayList<Integer> a1=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Limit-");
    int n=sc.nextInt();
    System.out.println("Enter n num-");
    for(int i=0;i<n;i++)
    {
    	int num=sc.nextInt();
    	a1.add(num);
    }
    System.out.println(a1);
    Collections.reverse(a1);
    System.out.println(a1);
    
    
}
}
