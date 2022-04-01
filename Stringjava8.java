package Example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Stringjava8 {
public static void main(String args[])
		{
	
		//String s= "hello";
		List<String> str = new ArrayList<String>();
		str.add("suma");
		str.add("Gowda");
		str.add("supii");
		str.add("AAAaaa");
		str.add("Basava");


		System.out.println(str);
		List<String> asList = new ArrayList<String>();
		for(String result:str)
		{
			if(result.length()>=5 )
			{
				asList.add(result);
				
			}
			 String s2=result.toLowerCase();
			 //System.out.println(s2);
			 String s3=result.toUpperCase();
			 //System.out.println(s3);
			}
		//System.out.println(asList);
List<String> b=str.stream().filter(i ->i.length()>5).collect(Collectors.toList());
		System.out.println(b);
List<String> c = str.stream().map(family ->family.toLowerCase()).collect(Collectors.toList());	
		System.out.println(c);
List<String> d=str.stream().map(family->family.toUpperCase()).collect(Collectors.toList());
System.out.println(d);
List<String> e=str.stream().map(family->family+"gowda").collect(Collectors.toList());
System.out.println(e);

	}
	}			
		
	

