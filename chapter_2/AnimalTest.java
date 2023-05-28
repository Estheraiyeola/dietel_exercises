import java.util.Scanner;


public class AnimalTest{

	public static void main(String[] args){
	
		Animal specimen = new Animal("Goat", 60.56, 3, true, "Terrestrial habitat");
		
		System.out.println("The name of the animal is " + specimen.getName());
		
		System.out.println("It weighs " + specimen.getSize() +"kg");
		
		System.out.println("It is " + specimen.getAge() + "years of age");
		
		System.out.println(specimen.getLegs() + ", it has 4 legs");
		
		System.out.println("Its type of habitat is the " + specimen.getHabitat());
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the animal: ");
		
		
	}
}
