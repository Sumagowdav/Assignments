package basicjava;
import java.util.*;
public class Even {
public static void main(String args[]) {
	int num;
	
	Scanner s = new Scanner(System.in);
	 
	 System.out.println(" enter the number");
	 num =s.nextInt();
	if(num%2==0)
	{
		System.out.println(" num is even");
	}
		else
		{
		System.out.println(" not even num");	}
}
}
