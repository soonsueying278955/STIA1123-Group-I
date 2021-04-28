package ExerciseSuperSubClass;

public class Strawberry extends Fruit{

	private String size;
	private int water;
	private double protein;
	private double fat;
	
	
	public Strawberry() {
		super();
		size = " ";
		water = 0;
		protein = 0;
		fat = 0;
	}
	
	public Strawberry(String N, String S, int W, double P, double F) {
		super(N);
		size = S;
		water = W;
		protein = P;
		fat = F;
	}
	
	public String getSize() {
		return size;
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
	
	public String toString() {
		return super.toString() + "\nSize\t = " + size + 
								  "\nWater\t = " + water + "%" +
								  "\nProtein\t = " + protein + " grams" + 
								  "\nFat\t = " + fat + " g";
	}
}
