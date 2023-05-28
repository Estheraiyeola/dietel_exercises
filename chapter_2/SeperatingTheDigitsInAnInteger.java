import java.util.Scanner;


public class SeperatingTheDigitsInAnInteger{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		int number = input.nextInt();
		
		int firstNumber = number / 10000;
		int firstNumber2 = firstNumber % 10000;
		
		int secondNumber = number / 1000;
		int secondNumber2 = secondNumber % 10;
		
		int thirdNumber = number / 100;
		int thirdNumber2 = thirdNumber % 10;
		
		int fourthNumber = number / 10;
		int fourthNumber2 = fourthNumber % 10;
		
		int fifthNumber = number % 10;
		
		System.out.printf("%d is the first number%n", firstNumber2);
		System.out.printf("%d is the second number%n", secondNumber2);
		System.out.printf("%d is the third number%n", thirdNumber2);
		System.out.printf("%d is the fourth number%n", fourthNumber2);
		System.out.printf("%d is the fifth number%n", fifthNumber);
		
		System.out.printf("%d   %d   %d   %d   %d%n", firstNumber2, secondNumber2, thirdNumber2, fourthNumber2, fifthNumber);
	}
}
