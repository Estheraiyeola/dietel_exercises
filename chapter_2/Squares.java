import java.util.Scanner;

public class Squares{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int integerOne = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int integerTwo = input.nextInt();
		
		int squareOne = integerOne * integerOne;
		int squareTwo = integerTwo * integerTwo;
		
		int sumOfSquare = squareOne + squareTwo;
		int diffOfSquare = squareOne - squareTwo;
		
		System.out.printf("Square of first integer is %d%n", squareOne);
		System.out.printf("Square of second integer is %d%n", squareTwo);
		System.out.printf("Sum of the square of both numbers is %d%n", sumOfSquare);
		System.out.printf("Difference of the square of both numbers is %d%n", diffOfSquare);
	
	}


}
