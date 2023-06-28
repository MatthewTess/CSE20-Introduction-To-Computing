import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double numerator;
		double denominator;

		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator: ");
		numerator = keyboard.nextDouble();
		System.out.print("Enter the denominator: ");
		denominator = keyboard.nextDouble();
		if (denominator == 0)
			System.out.print(" Dividing by 0! ");
		
		else
			System.out.println(numerator + "/" + denominator + " = " + (double) (numerator/denominator));
	

	}

}
