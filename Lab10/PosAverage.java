import java.util.Scanner;
public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int total = 0;
		int i = 0;
		int sum = 0;
		int average = 0;
		total = 0;

		while (total >= 0) {
			System.out.print("Enter an integer (negative to quit): ");
			total = input.nextInt();

			if (total >= 0) {
				i++;

				sum = sum + total; 	

			}
		}
		if (i > 0)
		average = sum / i;
		System.out.println("Average:"+ average);
	}	
}


