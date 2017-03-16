import java.util.Date;

import java.util.Scanner;
/**
 * @author zwaclaw
 *
 */

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("HELLO UGLY WORLD!");
	System.out.println("The World is not ugly!");


Scanner reader = new Scanner(System.in);
		
		String string;
		int sk;
		String vardas;


System.out.println("Please enter string:");
		string = reader.next();

System.out.println("Please enter sk:");
		sk = reader.nextInt();
		
		System.out.println(string + " " + sk);


System.out.println("Please enter your name:");
		vardas = reader.next();
		
		System.out.println("Hello " + vardas);


 Date date = new Date();


 System.out.println(date.toString());
	

}
}
