import java.util.Scanner;

public class Multiple{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int firstInteger = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int secondInteger = input.nextInt();
		
		int tripledFirstNumber = firstInteger * 3;
		int doubledSecondNumber = secondInteger * 2;
		
		if(doubledSecondNumber % tripledFirstNumber == 0){
		
			System.out.printf("%d is the multiple of %d when %d is tripled and %d is doubled%n", firstInteger, secondInteger, firstInteger, secondInteger);
		}
		
		else{
			System.out.println("Awwwww!!! Not multiples🥲️!! Try again pls");
		}
		
	}
}
