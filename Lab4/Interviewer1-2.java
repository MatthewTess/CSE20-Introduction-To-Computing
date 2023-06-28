import java.util.Scanner;
public class Interviewer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.print("What is your name? ");
		name = input.nextLine();

	
		System.out.print( "What is your age, " + name + "? ");
		int age =input.nextInt();
		
		String location;
		location = input.nextLine();
		System.out.print(" Where do you live and how is it " + name + "? ");
		location = input.nextLine();
		
		String food;
		food = input.nextLine();
		System.out.print(" What is your favorite food and why " + name + "?");
		food = input.nextLine();
		
		
		String car;
		System.out.print("What car do you like the most and why " + name + "? ");
		car = input.next();
		
		
		String majoring;
		majoring = input.nextLine();
		System.out.print(" What are you majoring in " + name + "? " + " Use complete sentences." );
		majoring = input.nextLine();
	
		
		Double n1;

		System.out.println(" Please enter your weight in pounds " + name + ": ");
		n1 = input.nextDouble();
	
		Double average;
		average = (n1)/2.2;
		
	
		System.out.print("Their name is ");
		System.out.println(name);
		System.out.print(name + " age is " + age + ". ");
		System.out.print( name + " location is " + location + ". ");
		System.out.print(name + " favorite food is " + food + ". ");
		System.out.print(name + ", who is " + age + " likes " + car + " the most. ");
		System.out.print(name + " is " + majoring);
		System.out.print( name + " weight in kilograms is: ");
		System.out.println(average);

		
		
		
		
		
	}

}
