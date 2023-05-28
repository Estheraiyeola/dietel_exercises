import java.util.Scanner;


public class SmallestAndLargest{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int integer1;
		int integer2;
		int integer3;
		
		int smallest;
		int largest;
		
		
		System.out.print("Enter the first integer: ");
		integer1 = input.nextInt();
		
		
		System.out.print("Enter the second integer: ");
		integer2 = input.nextInt();
		
		
		System.out.print("Enter the third integer: ");
		integer3 = input.nextInt();
		
		smallest = integer1;
		if (integer2 < smallest){
			smallest = integer2;
		}
		if (integer3 < smallest){
			smallest = integer3;
		}
		
		largest = integer1;
		if (integer2 > largest){
			largest = integer2;
		}
		if (integer3 > largest){
			largest = integer3;
		}
		
		
		System.out.println("The smallest number is " + smallest);
		System.out.println("The largest number is " + largest);
	}

}
