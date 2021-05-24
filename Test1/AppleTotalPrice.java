package Test1;

public class AppleTotalPrice {
	double price = 1.90;
	int quantity = 100;
	
	public double calcPrice() {
		Discount a = new AppleDiscount();
		a.display();
		
		double p = price * quantity;
		double pp = p * a.rateOfDiscount();
		return pp;
		
	}
}
