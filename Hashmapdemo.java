package p1;

import java.util.HashMap;

public class Hashmapdemo {
public static void main(String args[])
{
	HashMap h1 = new HashMap();
	h1.put(101, "nick");
	h1.put(102, "jhon");
	h1.put(103, "priyanka");
	h1.put(104, "zzz");
	System.out.println(h1);
	HashMap h2 = new HashMap();
	h2.put(201, "suma");
	h2.put(202, "gowda");
	h2.put(203, "vijayendra");
	System.out.println(h2);
	System.out.println(h1.containsKey(103));
	System.out.println(h1.containsValue("aaa"));
	System.out.println(h2.entrySet());
	System.out.println(h2.putIfAbsent(201, "puni"));
	System.out.println(h2.putIfAbsent(207, "puni"));
	System.out.println(h1.keySet());
    System.out.println(h1.values());
    h1.putAll(h2);
    System.out.println(h1);
    System.out.println(h1.remove(101, "nick"));
    System.out.println(h1);
    h2.clear();
    System.out.println(h2);
}
}
