package p1;
public class Largestofthreenum {
	public static void main(String args[])
	{
		int a=90,b=67,c=89;
		
		if(a>b && a>c )
		{
			System.out.println(" a is largest number");
		}
		else if(b>c && b>a)
		{
			System.out.println(" b is largest number");

		}
		else if(c>a && c>b)
		{
			System.out.println(" c is largest number");

		}
		else
		{
			System.out.println(" they are not unique values");

		}
	}

}
