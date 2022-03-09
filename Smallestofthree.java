package p1;

public class Smallestofthree {
	public static void main(String args[])
	{
		int a=90,b=67,c=89;
		
		if(a<b && a<c )
		{
			System.out.println(" a is smallest number");
		}
		else if(b<c && b<a)
		{
			System.out.println(" b is smallest number");

		}
		else if(c<a && c<b)
		{
			System.out.println(" c is smallest number");

		}
		else
		{
			System.out.println(" they are not unique values");

		}
	}
}
