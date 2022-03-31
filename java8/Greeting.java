package basicjava;

public class Greeting {
	
final static String salutation = "good afternoon !";
		   
 public static void main(String args[]) {
	GreetingService greetService1 = message -> 
    System.out.println(salutation + message);
   greetService1.sayMessage("have a good day");
}
}			
interface GreetingService {
void sayMessage(String message);
}


