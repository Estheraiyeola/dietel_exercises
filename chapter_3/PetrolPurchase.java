public class PetrolPurchase{
	private String stationLocation;
	private String petrolType;
	private int quantityInLitres;
	private double pricePerLitre;
	private double percentageDiscount;
	
	public PetrolPurchase(String stationLocation, String petrolType, int quantityInLitres, double pricePerLitre, double percentageDiscount){
		this.stationLocation = stationLocation;
		this.petrolType = petrolType;
		
		if(quantityInLitres > 0){
			this.quantityInLitres = quantityInLitres;
		}
		
		if(pricePerLitre > 0.00){
			this.pricePerLitre = pricePerLitre;
		}
		
		if(percentageDiscount > 0.00){
			this.percentageDiscount = percentageDiscount;
		}
	}
	
	public double getPurchaseAmount(){
		double netPurchaseAmount = quantityInLitres * pricePerLitre - percentageDiscount;
		return netPurchaseAmount;
	}
	
	
	public void setStationLocation(String stationLocation){
		this.stationLocation = stationLocation;
	}
	public String getStationLocation(){
		return stationLocation;
	}
	
	public void setPetrolType(String petrolType){
		this.petrolType = petrolType;
	}
	public String getPetrolType(){
		return petrolType;
	}
	
	
	public void setQuantityInLitres(int quantityInLitres){
		this.quantityInLitres = quantityInLitres;
	}
	public int getQuantityInLitres(){
		return quantityInLitres;
	}
	
	
	public void setPricePerLitre(double pricePerLitre){
		this.pricePerLitre = pricePerLitre;
	}
	public double getPricePerLitre(){
		return pricePerLitre;
	}
	
	
	public void setPercentageDiscount(double percentageDiscount){
		this.percentageDiscount = percentageDiscount;
	}
	public double getPercentageDiscount(){
		return percentageDiscount;
	}
}
