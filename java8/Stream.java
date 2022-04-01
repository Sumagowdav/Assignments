package basicjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class Stream {
	public static void main(JavastringDemo[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(10);
		a.add(20);
		a.add(5);
		a.add(15);
		a.add(25);
		System.out.println(a);
		
		List<Integer> evenList = new ArrayList<Integer>();
		 for(Integer result:a)
		 {
			 if(result%2==0)
			 {
				 evenList.add(result);
			 }
			 }
		// System.out.println(evenList);
//evenList			 
List<Integer> java8evenList	=a.stream().filter(i-> (i%2==0)).collect(Collectors.toList());
System.out.println(java8evenList);
//oddList
List<Integer> java8oddList	=a.stream().filter(i-> !(i%2==0)).collect(Collectors.toList());
System.out.println(java8oddList);
List<Integer> addDataList =a.stream().map(i->i+100).collect(Collectors.toList());
System.out.println(addDataList);
List<Integer> addDataList2 =a.stream().map(i->i+100).collect(Collectors.toList());
System.out.println(addDataList);

long EvenCount =a.stream().filter(i->i%2==0).count();
System.out.println(EvenCount);
List<Integer> sortDated =a.stream().sorted().collect(Collectors.toList());
System.out.println(sortDated);
long EvenCount2 =a.stream().sorted().count();
System.out.println(EvenCount2);














}

	
}
