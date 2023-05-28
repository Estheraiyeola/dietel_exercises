import java.util.Scanner;


public class CarApplication{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		Car version1 = new Car("Lexus", "2022", 7500000.00);

		
		System.out.printf("The model of the car is : %s%n", version1.getModel());
		System.out.printf("It was created in : %s%n", version1.getYear());
		System.out.printf("It is sold for : %.2f%n", version1.getPrice());
		
		System.out.print("Enter price negotiated to :  ");
		double price = input.nextDouble();
		double discountedPrice = price - (price / 100 * 5);
		System.out.printf("%nPrice of %s is %.2f%n%n", version1.getModel(), discountedPrice);
		
		Car version2 = new Car("Toyota", "2023", 8500000.00);
		
		System.out.printf("The model of the car is : %s%n", version2.getModel());
		System.out.printf("It was created in : %s%n", version2.getYear());
		System.out.printf("It is sold for : %.2f%n", version2.getPrice());
		
		System.out.print("Enter price negotiated to :  ");
		price = input.nextDouble();
		discountedPrice = price - (price / 100 * 7);
		System.out.printf("%nPrice of %s is %.2f%n%n", version2.getModel(), discountedPrice);
		
	
	}


}
