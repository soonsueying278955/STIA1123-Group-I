package Test1;

public class OrangeTotalPrice {
	double price = 10.99;
	int quantity = 25;
	
	public double calcPrice() {
		Discount o = new OrangeDiscount();
		o.display();
		
		double p = price * quantity;
		double pp = p * o.rateOfDiscount();
		return pp;
		
	}
}
