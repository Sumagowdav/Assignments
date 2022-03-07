package basicjava;

import java.util.ArrayList;
import java.util.List;

public class Collectiondemo {
public static void main(String args[])
{
	List a = new ArrayList();
	a.add("hey good morning");
	a.add("welcome");
	a.add("to home ");
	a.add("keep smiling ");
	System.out.println(a);
	System.out.println(a.size());
	System.out.println(a.contains("welcome"));
	System.out.println(a.contains("well"));
	a.remove("welcome");
	System.out.println(a);
	a.clear();
	System.out.println(a);
}
}