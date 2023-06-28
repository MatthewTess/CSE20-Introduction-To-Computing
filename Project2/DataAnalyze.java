import java.util.Arrays.*;
import java.util.Arrays;
import java.util.Scanner;


public class DataAnalyze {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		System.out.print("Please enter the sample size: ");
		int sample = input.nextInt();

		System.out.println("Enter numbers for trial 0 ");
		int[] trial= new int[sample];
		for (int counter = 0;counter<trial.length;counter++) {

			System.out.print("Enter sample #" + counter + ": ");
			trial[counter] = input.nextInt();
		}	


		System.out.println("Enter numbers for trial 1 ");
		int[] trial1= new int[sample];
		for (int counter = 0;counter<trial1.length;counter++) {

			System.out.print("Enter sample #" + counter + ": ");
			trial1[counter] = input.nextInt();
		}	

		System.out.println("Enter numbers for trial 2 ");
		int[] trial2= new int[sample];
		for (int counter = 0;counter<trial2.length;counter++) {

			System.out.print("Enter sample #" + counter + ": ");
			trial2[counter] = input.nextInt();
		}	

		System.out.println("Enter numbers for trial 3 ");
		int[] trial3= new int[sample];
		for (int counter = 0;counter<trial3.length;counter++) {

			System.out.print("Enter sample #" + counter + ": ");
			trial3[counter] = input.nextInt();





		}	
		int total = 0;
		int total1= 0;
		int total2=0;
		int total3 = 0;

		for (int element : trial) {
			total += element;

		}

		for (int element : trial1) {
			total1 += element;

		}

		for (int element : trial2) {
			total2 += element;

		}

		for (int element : trial3) {
			total3 += element;

		}

		int average = total/sample;
		int average1 = total1/sample;
		int average2 = total2/sample;
		int average3 = total3/sample;

		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");

		for (int i = 0; i<trial1.length; i++) {
			System.out.println( "         " +  i + "                " + trial[i] + " " + "      " + trial1[i] + " " + "      " + trial2[i] + " " + "      " + trial3[i] );
		}	

		int[]averages= {average, average1, average2, average3};
		Arrays.sort(averages);
		int maxavg = averages[averages.length - 1];
		int minavg = averages[0];
		for(int i=0; i<trial.length; i++){

			System.out.println("------------------------------------------------------------");
			System.out.println("      Average :" + "           " + average + "       " + average1 + "       " + average2 + "       " + average3);
			System.out.println("Min Average: " + minavg);
			System.out.println("Max Average: " +  maxavg);

		}
		if(maxavg == minavg) {
			System.out.println("the trials match EXACTLY!");
		}else if(maxavg < 2*minavg) {
			System.out.println("The trials concur with each other!");
		}else {
			System.out.println("The trials do NOT concur!");
		}
	}
}