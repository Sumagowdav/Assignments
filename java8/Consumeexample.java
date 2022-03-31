package basicjava;

import java.util.function.Consumer;

public class Consumeexample {
	public static void main(String args[])
	{
	Consumer<String> c1  = (s) ->System.out.println(s.length());
	c1.accept("sumagowda");
	Consumer<String> c2 = (s) ->System.out.println(s.toUpperCase());
	//c2.accept("hello k");
	Consumer<String> c3 = (s) ->System.out.println(s.toLowerCase());
	// c3.accept("SUMA");
	Consumer<String> c4=(s)  ->System.out.println(s.indexOf("j"));
	c4.accept("java8");
	c2.andThen(c3).accept("hey you THERE");
	Consumer<Integer> c6= (s) -> System.out.println(s+5);
	c6.accept(5);
}
}