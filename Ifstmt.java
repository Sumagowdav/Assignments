package basicjava;

public class Ifstmt {
public static void main(Demostring args[]) {
	int age =10;
/*	boolean iscitizen = false;
	if(age>=18 && iscitizen== true)
	{
		System.out.println(" you can vote");
	}
	else
	{
		System.out.println(" you cannot vote");
	
}*/
//String result= (age>=18)? "u can vote": "you cannot vote";
//System.out.println(result);
	/*for(int j=1;j<=5;j++)
	{
		for(int k=1;k<=j;k++)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}*/
	for(int j=5;j>=2;j--)
	{
		for(int k=5;k>=j;k--)
		{
			System.out.print(   " * "   );
		}
		System.out.println();
	}

}
}
