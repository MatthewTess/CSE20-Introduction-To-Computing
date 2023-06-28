
import java.util.Scanner;

public class SumSquare {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = 0;
		int sum  = 0;

		System.out.print("Please enter the max number:");
		max = input.nextInt();
		for (int i = 1; i <= max; i++) {
			System.out.println("Number " + i + " Squared is " + i * i);
			sum = sum + i * i;

		}
		System.out.println("Sum of squared " + sum);
	}
}