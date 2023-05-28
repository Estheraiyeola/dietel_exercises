import java.util.Scanner;

public class Compare{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer: ");
		int value = input.nextInt();
		
		int square = value * value;
		
		if(value > 100){
			System.out.printf("%d > 100%n", value);
		}
		
		if(square > 100){
			System.out.printf("%d > 100%n", square);
		}
		
		if(value < 100){
			System.out.printf("%d < 100%n", value);
		}
		
		if(square > 100){
			System.out.printf("%d < 100%n", square);
		}
		
		if(value == 100){
			System.out.printf("%d == 100%n", value);
		}
		
		if(square == 100){
			System.out.printf("%d == 100%n", square);
		}
		
		if(value != 100){
			System.out.printf("%d != 100%n", value);
		}
		
		if(square != 100){
			System.out.printf("%d != 100%n", square);
		}
	}

}
