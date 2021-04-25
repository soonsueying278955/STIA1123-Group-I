package ExerciseInheritance;

public class Strawberry extends Fruit{  //sub class for fruit

	private String size;
	private int water;
	private double protein;
	private double fat;
	
	public Strawberry(String name, String s, int a, double n, double f) {
		super(name);
		this.size = s;
		this.water = a;
		this.protein = n;
		this.fat = f;
		
	}
	
	public String getSize() {
		return this.size;
	}
	
	public int getWater() {
		return this.water;
	}
	
	public double getProtein() {
		return this.protein;
	}
	
	public double getFat() {
		return this.fat;
	}
	
	public String toString() {
		return super.toString() + "\nSize\t: " + size + "\nWater\t: " + water + "%" + "\nProtein\t: " + protein + " grams" + "\nFat\t: " + fat + " g"; 
	}
}
