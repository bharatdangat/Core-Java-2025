import java.util.*;
public class LinkedList2
{
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("pune");
		l1.add("thane");
		l1.add("mumbai");
		l1.add("rahata");
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
	}

}
