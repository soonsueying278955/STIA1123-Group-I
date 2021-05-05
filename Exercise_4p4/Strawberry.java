package Exercise_4p4;

public class Strawberry extends Fruit{

	private String shape;
	private double protein;
	private double fat;
	
	public Strawberry(String N, String S, double P, double F) {
		super(N);
		this.shape = S;
		this.protein = P;
		this.fat = F;
		
		switch(shape) {
		case "Small":
			System.out.println(Shape());
			break;
		
		case "Heart-shaped" :
			System.out.println(Shape(0.67 ,0.3));
			break;
		}
	}
	
	public String Shape() {
		return "Shapes\t\t : " + shape + "\nProtein\t\t : " + protein + "\nFat\t\t : " + fat;
	}
	
	public String Shape(double P) {
		return "Shape\t\t : " + shape + "\nProtein\t\t : " + protein;
	}
	
	public String Shape(double P, double F) {
		return "Shape\t\t : " + shape + "\nProtein\t\t : " + P + "\nFat\t\t : " + F;
	}
	
	//overriding method
	public String BenefitEating() {
		return "Strawberry is rich in carotene and vitamin A, which can relieve night blindness.";
	}
	
	//overriding method
	public String toString() {
		return BenefitEating();
	}
}
