
import java.util.Scanner;

public class Mutliples {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = 0;
		int base = 0;

		System.out.print("Please enter the max number:");
		max = input.nextInt();
		System.out.print("Please enter the base numbers:");
		base = input.nextInt();
		for (int i = 1; i <= max; i++) {
			if (i % base == 0) System.out.println("Number is " + i);

		}
	}
}