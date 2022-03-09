package p1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetdemo {
public static void main(String args[])
{
	HashSet ob1 = new HashSet();
		ob1.add("hello");
		ob1.add("hii");
		ob1.add("welcome");
		ob1.add("to java");
		ob1.add("training session");
	//	System.out.println(ob1.add("suma"));
	//	System.out.println(ob1);
		
		LinkedHashSet ob2 = new LinkedHashSet();
		ob2.add(90);
		ob2.add(65);
		ob2.add(10);
		ob2.add(0.98);
		ob2.add(45);
		//System.out.println(ob2);
		
		SortedSet a = new TreeSet();
       a.add(90);
       a.add(45);
       a.add(98);
       a.add(76);
       a.add(189);
       System.out.println(a);
      System.out.println(a.first());
      System.out.println(a.last());
      System.out.println(a.headSet(76));
      System.out.println(a.tailSet(98));
      System.out.println(a.subSet(45, 76));
      
      
}
}
