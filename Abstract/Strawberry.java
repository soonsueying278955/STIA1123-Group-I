package Abstract;

public class Strawberry extends Fruit{
	private double protein;
	private int grams;
	private double discount;
	
	public Strawberry(String N, double E, int G) {
		super(N);
		this.protein = E;
		this.grams = G;
		
		switch(grams) {
		case 10 :
			System.out.println("Total protein in " + grams + "g of strawberry " + "is " + totalProtein() + "g");
			break;
			
		case 50 :
			System.out.println("Total protein in " + grams + "g of strawberry " + "is " + totalProtein(0.34) + "g");
			break;
			
		case 100 :
			System.out.println("Total protein in " + grams + "g of strawberry " + "is " + totalProtein(0.7) + "g");
			break;
		}
	}
	
	public double rate_of_discount() {
		if(grams <= 10) {
			System.out.println("If grams is less than 10, you will not get the discount !!");
			discount = 0;
		}
		else if(grams >= 10 && grams <= 25) {
			System.out.println("If grams is more than 10 but less than 25, you will not get the discount !!");
			discount = 0;
		}
		else {
			System.out.println("If grams is more than 25, you will get 20% discount !!");
			discount = 0.20;
		}
		return discount;
	}
	
	public double totalProtein() {
		return protein;
	}
	
	public double totalProtein(double P) {
		return P;
	}	
	
	//overloading with no arguments
	public double totalPrice() {
		return 0;
	}
	
	//overloading with 1 arguments
	public double totalPrice(double P) {
		return P * this.grams;
	}
	
	//overloading with 2 arguments
	public double totalPrice(double P, double d) {
		return (P * this.grams) - ((P * this.grams) * (1-d));
	}
		
	//overriding method
	public String BenefitEating() {
		return "Strawberry is rich in carotene and vitamin A, which can relieve night blindness.";
	}
	
	//overriding method
	public String toString() {
		return BenefitEating() + "\nDiscount rate\t = " + rate_of_discount() + "\n";
	}
}
