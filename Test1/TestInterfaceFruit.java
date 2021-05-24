package Test1;

interface Discount{
	float rateOfDiscount();
	void display();
}

class AppleDiscount implements Discount{
	public float rateOfDiscount(){
		return 0.1f;
	}
	
	public void display() {
		System.out.println("This is apple discount");
	}
}

class DurianDiscount implements Discount{
	public float rateOfDiscount(){
		return 0.2f;
	}
	
	public void display() {
		System.out.println("\n\nThis is durian discount");
	}
}

class OrangeDiscount implements Discount{
	public float rateOfDiscount(){
		return 0.5f;
	}
	
	public void display() {
		System.out.println("\n\nThis is orange discount");
	}
}

public interface TestInterfaceFruit {
	public static void main(String[] args) {
		AppleTotalPrice atp = new AppleTotalPrice();
		System.out.printf("Total price: " + "RM " + "%.2f", atp.calcPrice());
		
		DurianTotalPrice dtp = new DurianTotalPrice();
		System.out.printf("Total price: " + "RM " + "%.2f", dtp.calcPrice());
		
		OrangeTotalPrice otp = new OrangeTotalPrice();
		System.out.printf("Total price: " + "RM " + "%.2f", otp.calcPrice());
	}
}
