package ExerciseInheritance;

public class GreenApple extends Apple{ //sub class for Apple
	
	private int fiber;
	private int quantity;
	private double price;
	
	public GreenApple(String name, double w, double c, int f, int q, double p) {
		super(name, w, c);
		fiber = f;
		quantity = q;
		price = p;
		
	}
	
	public int getFiber() {
		return this.fiber;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getTotalPrice() {
		return this.price * this.quantity;
	}
	
	public String toString() {
		return super.toString() + "\nFiber\t: " + fiber + " grams" + "\nQuantity want to buy: " + quantity + "\nTotal price : " + "RM " + getTotalPrice();
	}
}
