import java.util.Scanner;

public class Errors3 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner (System.in); // Added parenthesis for system in
		int numerator; // changed from Int (case sensitive)
		int denominator; // changed from Integer

		System.out.println("This program divides two numbers."); //I put in out after system
		System.out.print("Enter the numerator: "); //I put in out after system
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt(); // You spelled denominator wrong... really -_-

		System.out.print(numerator); // capitalized the S in system
		System.out.print("/");
		System.out.print(denominator); // capitalized the S in system, also lower cased p in print
		System.out.print(" = ");
		System.out.println((double) numerator/denominator); // lower cased p in print
	}
} // added this parenthesis closing this code portion
