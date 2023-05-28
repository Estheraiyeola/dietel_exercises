import java.util.Scanner;

public class LargestAndSmallestIntegers{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int secondInteger = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int thirdInteger = input.nextInt();
		
		System.out.print("Enter the fourth integer: ");
		int fourthInteger = input.nextInt();
		
		System.out.print("Enter the fifth integer: ");
		int fifthInteger = input.nextInt();
		
		int smallest = firstInteger;
		if(secondInteger < smallest){
			smallest = secondInteger;
		}
		
		if(thirdInteger < smallest){
			smallest = thirdInteger;
		}
		if(fourthInteger < smallest){
			smallest = fourthInteger;
		}
		if(fifthInteger < smallest){
			smallest = fifthInteger;
		}
		
		
		
		int largest = firstInteger;
		if(secondInteger > largest){
			largest = secondInteger;
		}
		
		if(thirdInteger > largest){
			largest = thirdInteger;
		}
		if(fourthInteger > largest){
			largest = fourthInteger;
		}
		if(fifthInteger > largest){
			largest = fifthInteger;
		}
		
		
		System.out.println("The smallest number is " + smallest);
		System.out.println("The largest number is " + largest);
		
		
	}
}
