package p1;

public class Stringex {
	public static void main(String args[]) {
		String str= "hello world", str2=" ";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("hello"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        str2= ch+str2; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ str2);
}
}