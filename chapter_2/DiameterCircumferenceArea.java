import java.util.Scanner;

public class DiameterCircumferenceArea{

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = input.nextInt();
		
		System.out.printf("%f is the diameter of a circle of radius %d%n", 2 * radius, radius);
		System.out.printf("%f is the circumference of a circle of radius %d%n", 2 * 3.14159 * radius);
		System.out.printf("%f is the area of a circle of radius %d%n", 3.14158 * (radius * radius));
		
	}
}
