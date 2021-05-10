package Abstract;

public class Apple extends Fruit implements Discount{

	protected double price;
	protected double quantity;
	protected double discount;
	
	public Apple(String N, double P, double Q) {
		super(N);
		this.price = P;
		this.quantity = Q;
		
		
		if(this.quantity < 10) {
			System.out.println("If quantity is less than 10, you will not get the discount !!");
			System.out.printf("Total price is " + "RM " + "%.2f", totalPrice());
		}
		
		else if(this.quantity > 10 && this.quantity < 50) {
			System.out.println("If quantity is more than 10 but less than 50, you will not get the discount !!");
			System.out.printf("Total price is " + "RM " + "%.2f", totalPrice());
		}
		
		else {
			System.out.println("If quantity is more than 50, you will get a 10% discount !!");
			System.out.printf("Total price is " + "RM " + "%.2f", totalPrice());
			}
		}
	public double rate_of_discount() {
		if(quantity < 10) {
			discount = 0;
		}
		else if(quantity > 10 && quantity < 50) {
				discount = 0;
		}
		else {
			discount = 0.1;
		}
		return discount;
	}
		
	public double totalPrice() {
		return this.price * this.quantity;
	}

	public double totalPrice(double pp) {
		return  pp * this.quantity;
	}
	
	public double totalPrice(double d, double pp) {
		return  (pp * this.quantity) * d;
	}

	//overriding method
	public String printInfo() {
		return "An apple is the fruit that contains high protein.";
	}
	
	//overriding method
	public String toString() {
		return printInfo() + "\nDiscount rate\t: " + rate_of_discount();
	}
}
