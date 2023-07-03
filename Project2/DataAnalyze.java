import java.util.Arrays;
import java.util.Scanner;

public class DataAnalyze {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the sample size: ");
        int sample = input.nextInt();

        int[][] trials = new int[4][sample];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter numbers for trial " + i);
            for (int j = 0; j < sample; j++) {
                System.out.print("Enter sample #" + j + ": ");
                trials[i][j] = input.nextInt();
            }
        }

        int[] totals = new int[4];
        int[] averages = new int[4];

        for (int i = 0; i < 4; i++) {
            for (int element : trials[i]) {
                totals[i] += element;
            }
            averages[i] = totals[i] / sample;
        }

        System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");

        for (int i = 0; i < sample; i++) {
            System.out.print("\t\t" + i + "\t\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(trials[j][i] + "\t\t");
            }
            System.out.println();
        }

        Arrays.sort(averages);
        int maxAvg = averages[3];
        int minAvg = averages[0];

        System.out.println("------------------------------------------------------------");
        System.out.println("      Average :\t" + averages[0] + "\t\t" + averages[1] + "\t\t" + averages[2] + "\t\t" + averages[3]);
        System.out.println("Min Average: " + minAvg);
        System.out.println("Max Average: " + maxAvg);

        if (maxAvg == minAvg) {
            System.out.println("The trials match EXACTLY!");
        } else if (maxAvg < 2 * minAvg) {
            System.out.println("The trials concur with each other!");
        } else {
            System.out.println("The trials do NOT concur!");
        }
    }
}
