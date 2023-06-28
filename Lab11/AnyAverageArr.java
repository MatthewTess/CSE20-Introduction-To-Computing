import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find tha average of any number you input. Please input a max number to average: ");
		int max = input.nextInt();

		int [] intArr = new int [max];
		for (int i = 0; i < max; i++)
		{

			System.out.print("Input a number: ");
			intArr[i] = input.nextInt();
		}

		int total = 0;
		for(int i =0; i < max; i ++) {
			total += intArr[i];
		System.out.print(intArr[i] + " ");
		}

		System.out.println("Average is " + (total / max));
	}
}
