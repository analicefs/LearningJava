import java.util.Scanner;
public class InputAndOutput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
// declarations variable
		int number1; 
		int number2;
		int sum;
// outputs
		System.out.println("Enter first integer number\n");
// inputs
		number1=input.nextInt();
// outputs
		System.out.println("Enter second integer number\n");
// inputs
		number2= input.nextInt();
		
		sum=number1+number2;
// outputs
		System.out.println("The sum is " + sum);
	}

}
