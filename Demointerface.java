package basicjava;

abstract class Num
{
	abstract void run();
}

class Demointerface extends Num implements Interfacedemo
{
	void run()
	{
		System.out.println(" run safely");
	}
	
	 public void add()
	{
		System.out.println(" it gives addition of two numbers result");
	}
	public void sub()
	{
		System.out.println("subtract two numbers");
	}
	
	public static void main(String args[])
	{
		Demointerface ob1 = new Demointerface();
		ob1.add();
		ob1.sub();
		ob1.run();
	}
}