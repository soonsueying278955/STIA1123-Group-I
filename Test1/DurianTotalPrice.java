package Test1;

public class DurianTotalPrice {
	double price = 10.99;
	int quantity = 25;
	
	public double calcPrice() {
		Discount d = new DurianDiscount();
		d.display();
		
		double p = price * quantity;
		double pp = p * d.rateOfDiscount();
		return pp;
		
	}
}
