package Exercise4_6;

public class Apple extends Fruit{

	private int quantity;
	private double price;
	
	public Apple(String N, int Q, double P) {
		super(N);
		this.quantity = Q;
		this.price = P;
		
		Price ap = new AppleTotalPrice();
		Price gp = new GrapesTotalPrice();
		Price sp = new StrawberryTotalPrice();
		
		System.out.println("Fruit\t\t : " + N);
		if(quantity < 10) {
			System.out.printf("Total price\t : " + "RM " + "%.2f", ap.totalPrice(Q));
		}
		else if(quantity >= 10 && quantity <= 50){
			if(N == "Apple" || N == "Red Apple" || N == "Green Apple") {
				double a = 1.59; //price for quantity apple is more than 10 but less than 50
			
				System.out.printf("Price\t\t : " + "RM " + "%.2f", a);
				System.out.println("\n\n" + "If quantity is more than 10 but less than 50, you will not get the discount.");
				System.out.printf("Total price\t : " + "RM " + "%.2f", ap.totalPrice(Q));
			}
			else if(N == "Grapes") {
				double g = 2.09; //price for quantity grapes is more than 10 but less than 50
				
				System.out.printf("Price\t\t : " + "RM " + "%.2f", g);
				System.out.println("\n" + "If quantity is more than 50, you will get 15% discount.");
				System.out.printf("Total price\t : " + "RM " + "%.2f", gp.totalPrice(Q));
			}
			else if(N == "Strawberry") {
				double s = 2.59; //price for quantity strawberry is more than 10 but less than 50
				
				System.out.printf("Price\t\t : " + "RM " + "%.2f", s);
				System.out.println("\n" + "If quantity is more than 50, you will get 20% discount.");
				System.out.printf("Total price\t : " + "RM " + "%.2f", sp.totalPrice(Q));
			}
		}
		
		else {
			if(N == "Apple" || N == "Red Apple" || N == "Green Apple") {
				double a2 = 1.40; //price of quantity apple is more than 50
				Discount a = new Apple_Discount();
				double da = a.rate_of_discount();
				
				System.out.println("Quantity bought\t : " + quantity);
				System.out.printf("Price\t\t : " + "RM " + "%.2f", a2);
				System.out.println();
				System.out.print("\n" + "If quantity is more than 50, you will get 10% discount.");
				System.out.println("\n"+ "Discount\t : " + a.rate_of_discount());
				System.out.printf("Total price\t : " + "RM " + "%.2f", ap.totalPrice(Q, da));
				
			}
			else if(N == "Grapes"){
				double g2 = 1.99; //price of quantity grapes is more than 50
				Discount g = new Grapes_Discount();
				double dg = g.rate_of_discount();
				
				System.out.println("Quantity bought\t : " + quantity);
				System.out.printf("Price\t\t : " + "RM " + "%.2f", g2);
				System.out.println();
				System.out.println("\n" + "If quantity is more than 50, you will get 15% discount.");
				System.out.println("Discount\t : " + g.rate_of_discount());
				System.out.printf("Total price\t : " + "RM " + "%.2f", gp.totalPrice(Q, dg));
				
			}
			else if(N == "Strawberry"){
				double s2 = 2.30; //price of quantity strawberry is more than 50
				Discount s = new Strawberry_Discount();
				double ds = s.rate_of_discount();
				
				System.out.println("Quantity bought\t : " + quantity);
				System.out.printf("Price\t\t : " + "RM " + "%.2f", s2);
				System.out.println();
				System.out.println("\n" + "If quantity is more than 50, you will get 20% discount.");
				System.out.println("Discount\t : " + s.rate_of_discount());
				System.out.printf("Total price\t : " + "RM " + "%.2f", sp.totalPrice(Q, ds));
				
			}
		}
	}
	
	public String name() {
		return "Fruit\t\t : " + name;
	}
	
	//overriding method
	public String printBenefit() {
		return "\nAn apple is the fruit that contains high protein.";
	}
	
	//overriding method
	public String toString() {
		return printBenefit();
	}
}
