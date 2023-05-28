import java.util.Scanner;

public class ThreeNumbers{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int int1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int int2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		int int3 = input.nextInt();
		
		int sum = int1 + int2 + int3;
		
		int average = (int1 + int2 + int3) / 3;
		
		int product = int1 * int2 * int3;
		
		if(int1 > int2 > int3){
			System.out.printf("%d > %d > %d%n", int1, int2);
		}
		
		
		
		if(int1 < int2 < int3){
			System.out.printf("%d < %d < %d%n", int1, int2);
		}
		
		
	}
}
