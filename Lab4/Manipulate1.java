import java.util.Scanner;

public class Manipulate1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double n1, n2;

		System.out.println("Please enter the first number:");
		n1 = input.nextDouble();
		
		System.out.print("Please enter the second number:");
		n2 = input.nextDouble();

		double average;
		average = (n1+n2);
		System.out.print("The sum of the numbers is ");
		System.out.println(average);
		average = (n1*n2);
		System.out.print("The product of the number is ");
		System.out.println(average);
		average = (n1-n2);
		System.out.print("The difference of the number is ");
		System.out.println(average);
		average = (n1%n2);
		System.out.print("The reminader of the number is ");
		System.out.println(average);
		average = (n1/n2);
		System.out.println("The quotient of the number is " + average);
		
		
		
		
		short s1, s2;
		
		System.out.print("Please enter the first number:");
		s1 = input.nextShort();

		System.out.print("Please enter the second number:");
		s2 = input.nextShort();
		
		short shortAvg;
		shortAvg = (short) ((s1*s2));
		System.out.print("The product of the number is ");
		System.out.println(shortAvg);
		shortAvg = (short) ((s1-s2));
		System.out.print("The difference of the number is ");
		System.out.println(shortAvg);
		shortAvg = (short) ((s1+s2));
		System.out.print("The sum of the number is ");
		System.out.println(shortAvg);
		shortAvg = (short) ((s1%s2));
		System.out.print("The remainder of the number is ");
		System.out.println(shortAvg);
		shortAvg = (short) ((s1/s1));
		System.out.print("The quotient of the number is ");
		System.out.println(shortAvg);
		
		
		float n5, n6;
		
		System.out.println("Please enter the first number:");
		n5 = input.nextFloat();
		
		System.out.print("Please enter the second number:");
		n6 = input.nextFloat();
		
		float aver;
		aver = (n5*n6);
		System.out.print("The product of the number is ");
		System.out.println(aver);
		aver = (n5-n6);
		System.out.print("The difference of the number is ");
		System.out.println(aver);
		aver = (n5+n6);
		System.out.print("The sum of the number is ");
		System.out.println(aver);
		aver = (n5%n6);
		System.out.print("The remainder of the number is ");
		System.out.println(aver);
		aver = (n5/n6);
		System.out.print("The quotient of the number is ");
		System.out.println(aver);
		
		int n7, n8;
	
		System.out.println("Please enter the first number:");
		n7 = input.nextInt();
		
		System.out.print("Please enter the second number:");
		n8 = input.nextInt();
		
		int avg;
		avg = (n7*n8);
		System.out.print("The product of the number is ");
		System.out.println(avg);
		average = (n7-n8);
		System.out.print("The difference of the number is ");
		System.out.println(avg);
		avg = (n7+n8);
		System.out.print("The sum of the number is ");
		System.out.println(avg);
		avg = (n7%n8);
		System.out.print("The remainder of the number is ");
		System.out.println(avg);
		avg = (n7/n8);
		System.out.print("The quotient of the number is ");
		System.out.println(avg);
		
		char charA = 'Y';
		System.out.println("Output is " + (char) (1 + charA));
		
		
	
		
	}

}

