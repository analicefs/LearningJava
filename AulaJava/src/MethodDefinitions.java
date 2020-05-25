import java.util.Scanner;
import java.util.Scanner;

public class MethodDefinitions {
	private static int add(int number1, int number2) {
		return number1+number2;
	}
		
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				
				
		// declarations variable
				int number1; 
				int number2;
				int sum;
		// outputs
				System.out.print("Enter first integer number");
		// inputs
				number1=input.nextInt();
		// outputs
				System.out.print("Enter second integer number");
		// inputs
				number2= input.nextInt();
				
		// the variable call Method Definitions
				sum=MethodDefinitions.add(number1, number2);
		// outputs
				System.out.println("The sum is " + sum);
			}

		
	}

