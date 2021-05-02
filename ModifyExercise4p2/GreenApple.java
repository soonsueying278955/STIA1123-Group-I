package ModifyExercise4p2;

public class GreenApple extends Apple{

	private int fiber;
	private int quantity;
	private double price;
	
	
	public GreenApple() { //constructor for sub class
		super(); //inherit data,method from super class( constructor with no argument)
	}

	public GreenApple(String N, double W, double C, int F, int Q, double P) { //constructor sub class with argument
		super(N, W, C); //called method in superclass with passing parameter
		fiber = F;
		quantity = Q;
		price = P;
	}

	public int getFiber() {
		return fiber;
	}

	public int getQuantity() {
		return quantity;
	}

	//overloading method
	public double totalPrice(double P) {
		return price;
	}

	//overloading method
	public double totalPrice(int Q, double P) {
		return price * quantity;
	}

	//overriding method
	public String toString(){ 
		return super.toString() + "\nFiber\t = " + fiber + " grams" + 
								  "\nQuantity = " + quantity + 
								  "\nPrice\t = " + "RM " + totalPrice(4) + 
								  "\nTotal price = " + "RM " + totalPrice(4, 8);
	}

	//overriding method
	public String printInfo() {
		return "Green apple acid content is high, which is good for beauty.";
	}
}
