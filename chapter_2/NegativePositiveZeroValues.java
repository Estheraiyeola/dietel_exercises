import java.util.Scanner;

public class NegativePositiveZeroValues{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter five(5) numbers separated by spaces: ");
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int thirdNumber = input.nextInt();
		int fourthNumber = input.nextInt();
		int fifthNumber = input.nextInt();
		
		int countNegativeNumbers = 0;
		int countPositiveNumbers = 0;
		int countEqualToNumbers = 0;
		
		if(firstNumber < 0){
			countNegativeNumbers += 1;	
		}
		else if(firstNumber > 0){
		
			countPositiveNumbers += 1;
		}
		else{
		
			countEqualToNumbers += 1;
		}
		
		if(secondNumber < 0){
			countNegativeNumbers += 1;	
		}
		else if(secondNumber > 0){
		
			countPositiveNumbers += 1;
		}
		else{
		
			countEqualToNumbers += 1;
		}
		
		if(thirdNumber < 0){
			countNegativeNumbers += 1;	
		}
		else if(thirdNumber > 0){
		
			countPositiveNumbers += 1;
		}
		else{
		
			countEqualToNumbers += 1;
		}
		
		if(fourthNumber < 0){
			countNegativeNumbers += 1;	
		}
		else if(fourthNumber > 0){
		
			countPositiveNumbers += 1;
		}
		else{
		
			countEqualToNumbers += 1;
		}
		
		if(fifthNumber < 0){
			countNegativeNumbers += 1;	
		}
		else if(fifthNumber > 0){
		
			countPositiveNumbers += 1;
		}
		else{
		
			countEqualToNumbers += 1;
		}
		System.out.println("The amount of positive numbers are : " + countPositiveNumbers);
		
		System.out.println("The amount of negative numbers are : " + countNegativeNumbers);
		
		System.out.println("The amount of equal to zero numbers are : " + countEqualToNumbers);
	}
}
