import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); // Changed scanner to keyboard from kbd
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will "); // I added a missing semicolon
		System.out.print("square it for you:"  ); // I added missing quotes
		number =  keyboard.nextInt(); //I put in () for this line, was missing

		theSquare = number * number;

		System.out.print(number + " squared = "); // I added a closing Parenthesis
		System.out.println(theSquare);
	}
}