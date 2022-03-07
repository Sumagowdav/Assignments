package basicjava;

public class Javamethods {

	public static void main(Demostring args[]) {
		m1();
		int sum = m2();
		System.out.println("sum is :" +  sum);
		int res = m3(8,9);
		System.out.println("sum is again:" +res);
	}
	
	static void m1()
	{
		System.out.println(" hello");
	}
	public static int m2( )
	{
		return 2+3;
	}
	static  int m3(int num1, int num2) {
		return num1+num2;
	}
}

