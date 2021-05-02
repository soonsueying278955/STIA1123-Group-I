package ModifyExercise4p2;

public class Strawberry extends Fruit{

	private String shape;
	private int water;
	private double protein;
	private double fat;
	
	
	public Strawberry() {
		super();
		shape = " ";
		water = 0;
		protein = 0;
		fat = 0;
	}
	
	public Strawberry(String N, String S, int W, double P, double F) {
		super(N);
		shape = S;
		water = W;
		protein = P;
		fat = F;
	}
	
	public String getShape() {
		return shape;
	}
	
	//overloading method
	public String getInfoShape(String S) {
		return "Shape\t = " + S;
	}
	
	//overloading method
	public String getInfoShape(String S1, String S2) {
		return "The type of shape strawberry is " + S1 + " and " + S2;
	}
		
	public int getWater() {
		return water;
	}
	
	public double getProtein() {
		return protein;
	}
	
	public double getFat() {
		return fat;
	}
	
	//overriding method
	public String toString() {
		return super.toString() + "\nWater\t = " + water + "%" +
								  "\nProtein\t = " + protein + " grams" + 
								  "\nFat\t = " + fat + " g"  + 
								  "\n" + getInfoShape("oval") + 
								  "\n" + getInfoShape("oval", "heart-shaped");
	}

	//overriding method
	public String BenefitEating() {
		return "Strawberry is rich in carotene and vitamin A, which can relieve night blindness.";
	}
}
