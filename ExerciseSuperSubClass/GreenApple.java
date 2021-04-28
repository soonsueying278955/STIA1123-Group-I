package ExerciseSuperSubClass;

public class GreenApple extends Apple{ 

	private int fiber;
	private int quantity;
	private double price;
	
	
	public GreenApple() { //constructor for sub class
		super(); //inherit data,method from super class( constructor with no argument)
		fiber = 0;
		quantity = 0;
		price = 0;
	}
	
	public GreenApple(String N, double W, double C, int F, int Q, double P) { //constructor sub class with argument
		super(N, W, C); //called method in superclass with passing parameter
		fiber = F;
		quantity = Q;
		price = P;
		
		setInfo(N, W, C, F, Q, P); //method for overloading
	}
	
	public void setInfo(String N, double W, double C, int F, int Q, double P) { //overloading method with 6 parameter
		if(F >= 0)
			fiber = F;
		else
			fiber = 0;
		
		
		if(Q >= 0)
			quantity = Q;
		else
			quantity = 0;
		
		
		if(P >= 0)
			price = P;
		else
			price = 0;
	}
	
	public int getFiber() {
		return fiber;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getTotalPrice() {
		return price * quantity;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nFiber\t = " + fiber + " grams" + 
								  "\nQuantity = " + quantity + 
								  "\nPrice\t = " + price + 
								  "\nTotal price = " + "RM " + getTotalPrice();
	}
}
