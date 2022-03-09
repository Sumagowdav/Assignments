package p1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiteratordemo {
	public static void main(String args[])
	{
		LinkedList li = new LinkedList();
		li.add("hii");
		li.add("hello team");
		li.add("welcome");
		ListIterator listIterator = li.listIterator();
		listIterator.add(" java class");
		 System.out.println(li);
		while(listIterator.hasNext())
		{
			listIterator.add("99");
	
		if(listIterator.next().equals("hii"))
		{
			listIterator.set("100");
		
	System.out.println(listIterator.next());			
		 System.out.println(li);
		}
	
		}
}
}