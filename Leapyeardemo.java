package p1;

import java.util.Scanner;

public class Leapyeardemo {
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	System.out.println(" please enter the year");
	 int year = s.nextInt();
	 if((year%400 == 0)||((year%4==0) &&(year%100 !=0)))
	 {
		 System.out.println(" year is leap year" +year);
	 }
	 else
	 {
		 System.out.println(" year is  not leap year" +year);

	 }
}
}
