import java.util.Scanner;
// I imported this Scanner here
public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?"); // I added a closing quote here	
		System.out.println("Enter two numbers and I ");
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in); // I added a semicolon here
		n1 = keyboard.nextInt(); // I inputed keyboard
		n2 = keyboard.nextInt(); // I inputed keyboard and capitalized I in Int
		
		
		System.out.println("The sum of the numbers is");// I put in System.out from the first println
		System.out.println(n1 + n2);
	}
}
