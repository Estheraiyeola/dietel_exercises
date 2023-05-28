public class Petrol{
	public static void main(String[] args){
		PetrolPurchase purchase = new PetrolPurchase("Iyana Ipaja", "Kerosene", 5, 950.00, 1.50);
		
		System.out.printf("The station's location is : %s%n ", purchase.getStationLocation());
		System.out.printf("The type of petrol is : %s%n", purchase.getPetrolType());
		System.out.printf("The number of litres is : %d%n", purchase.getQuantityInLitres());
		System.out.printf("The price per litre is : %.2f%n", purchase.getPricePerLitre());
		System.out.printf("The percentage discount is : %.2f%n", purchase.getPercentageDiscount());
		System.out.printf("The net purchase amount is : %.2f%n", purchase.getPurchaseAmount());
		
		
		purchase.setStationLocation("Abuja");
		purchase.setPetrolType("Engine Oil");
		purchase.setQuantityInLitres(10);
		purchase.setPricePerLitre(1500.00);
		purchase.setPercentageDiscount(20.00);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("The new station's location is : %s%n ", purchase.getStationLocation());
		System.out.printf("The new type of petrol is : %s%n", purchase.getPetrolType());
		System.out.printf("The new number of litres is : %d%n", purchase.getQuantityInLitres());
		System.out.printf("The new price per litre is : %.2f%n", purchase.getPricePerLitre());
		System.out.printf("The new percentage discount is : %.2f%n", purchase.getPercentageDiscount());
		System.out.printf("The new net purchase amount is : %.2f%n", purchase.getPurchaseAmount());
		
		
	}
}
