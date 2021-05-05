package Exercise_4p4;

public class Apple extends Fruit{

	protected double price;
	protected double quantity;
	
	public Apple(String N, double P, double Q) {
		super(N);
		this.price = P;
		this.quantity = Q;
		
		if(this.quantity < 10) {
			TotalPrice(); //overloading with no arguments
			System.out.printf("If quantity of apple is less than 10, total price is " + "RM " + "%.2f", TotalPrice());
		}
		
		else if(this.quantity > 10 && this.quantity < 50) {
			double pp = 1.59; //purchase more than 10 but less than 50, the price is RM 1.59 
			TotalPrice(pp); //overloading with 1 argument
			System.out.printf("If quantity of apple is more than 10, total price is " + "RM " + "%.2f", TotalPrice(pp));
		}
		
		else {
			double pp = 0.59; //purchase more than 50, the price is RM0.59
			double dd = 0.; //discount 10% for purchase more than 50
			TotalPrice(pp, dd); //overloading with 2 arguments
			System.out.printf("If quantity of apple is more than 10, total price is " + "RM " + "%.2f", TotalPrice(pp, dd));
		}
	}

	public double TotalPrice() {
		return this.price * this.quantity;
	}

	public double TotalPrice(double pp) {
		return  pp * this.quantity;
	}
	
	public double TotalPrice(double dd, double pp) {
		return  (pp * this.quantity) * dd;
	}

	//overriding method
	public String printInfo() {
		return "An apple is the fruit that contains high protein.";
	}
	
	//overriding method
	public String toString() {
		return printInfo();
	}
}
