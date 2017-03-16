import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		String string;
		int sk;
		
		System.out.println("Please enter string:");
		string = reader.next();
		
		System.out.println("Please enter sk:");
		sk = reader.nextInt();
		
		System.out.println(string + " " + sk);

	}

}

