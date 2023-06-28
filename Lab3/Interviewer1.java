import java.util.Scanner;
public class Interviewer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String name;
		System.out.print("What is your name? ");
		name = input.next();
		System.out.print("Their name is ");
		System.out.println(name);
	
		System.out.print( "What is your age? ");
		int age =input.nextInt();
		System.out.print("Their age is " );
		System.out.println(age);
		
		String location;
		System.out.print(" Where do you live? ");
		location= input.next();
		System.out.print("Their location is ");
		System.out.println(location);
		
		String food;
		System.out.print("What is your favorite food? ");
		food = input.next();
		System.out.print("Their favorite food is ");
		System.out.println(food);
		
		String car;
		System.out.print("What car do you like the most ");
		car = input.next();
		System.out.print("They like ");
		System.out.print(car);
		System.out.print(" the most");
		
		
		
		
		
	}

}
