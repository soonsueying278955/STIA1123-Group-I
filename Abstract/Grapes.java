package Abstract;

public class Grapes extends Fruit{
	private int water, kilogram;
	private double discount;
	
	public Grapes(String N, int W, int K) {
		super(N);
		this.water = W;
		this.kilogram = K;
		
		
		switch(kilogram) {
		case 10 :
			System.out.println("Total water in " + kilogram + "g of strawberry " + "is " + totalWater() + "%");
			break;
			
		case 20:
			System.out.println("Total water in " + kilogram + "kg of grapes " + "is " + totalWater() + "%");
			break;
		}
	}
	
	public double rate_of_discount() {
		if(kilogram <= 10) {
			System.out.println("If kilogram is less than 10, you will not get the discount !!");
			discount = 0;
		}
		else if (kilogram >= 20) {
			System.out.println("If quantity is more than 10, you will get 5% discount !!");
			discount = 0.15;
		}
		return discount;
	}

	public int totalWater() {
		return water;
	}
	
	public int totalWater(int K) {
		return K;
	}
	
	
	//overloading with no arguments
	public double totalPrice() {
		return 0;
	}
	
	//overloading with 1 arguments
	public double totalPrice(double P) {
		return P * this.kilogram;
	}
		
	//overloading with 2 arguments
	public double totalPrice(double P, double d) {
		return (P * this.kilogram) - ((P * this.kilogram) - (1-d));
	} 
		
	//overriding method
	public String printBenefitEating() { 
		return "Eating grapes may decrease blood sugar levels and also protect against diabetes.";
	}
	
	//overriding method
	public String toString() {
		return printBenefitEating() + "\nDiscount rate\t = " + rate_of_discount();
	}

	
}
