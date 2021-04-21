package Inheritance;

public class Husky extends Dog {
	private int quantity;
	private int price;

	
	public Husky(String B, String C, String P,  int Q, int M) {
		super (B,C,P); // super = parent	
		quantity = Q;
		price = M;
	
	}
	public int getQuantity() {
		return quantity;
	}
	public int getPrice() {
		return price;
	}
	public double calTotalPrice() {
		return getQuantity() * getPrice();
	}
	public String toString() {
		return super.toString() + "\n" +  "Quantity want to purchase\t: " + quantity +  "\n" + "Market price per dog\t\t: " + price;
	}
}
