package p1;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {
public static void main(String args[])
{
	ArrayList a = new ArrayList();
	//a.add(67);
	//a.add(6);
	//a.add(7);
	a.add("hello");
	a.add("hii");
	a.add("welcome");
	
	Iterator b = a.iterator();
			while(b.hasNext())
			{
				System.out.println(b.next());
				   
				// System.out.println(b.remove());
			}
			 
    }
}
