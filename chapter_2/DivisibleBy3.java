import java.util.Scanner;

public class DivisibleBy3{

	public static void main(String[] main){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int divisibleNumber = input.nextInt();
		
		if(divisibleNumber % 3 == 0){
			System.out.println(divisibleNumber + " is divisible by 3");
		} else{
			System.out.println(divisibleNumber + "is not divisible by 3");
		}
			
	
	}


}
