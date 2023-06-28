import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) 
	{
		int i = 0;
		int n, a, sum = 0;
		int average;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter how many numbers you want to average: ");
		n = input.nextInt();
		System.out.println("Enter all the numbers: ");
		while ( i < n ){
	
			a = input.nextInt();	
			sum = sum + a; 	
			i++; 	}
	
		average = sum / n;
		System.out.println("Average:"+average);

	}
}