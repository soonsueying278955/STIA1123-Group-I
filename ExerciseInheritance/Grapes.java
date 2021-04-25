package ExerciseInheritance;

public class Grapes extends Fruit { //sub class for fruit
	
	protected String color;
	protected double carbohydrate;
	protected int energy;
	
	public Grapes(String name, String o, double c, int e) {
		super(name);
		this.color = o;
		this.carbohydrate = c;
		this.energy = e;
		
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getCarbohydrate() {
		return this.carbohydrate;
	}
	
	public double getEnergy() {
		return this.energy;
	}
	
	public String toString() {
		return super.toString() + "\nColor\t: " + color + "\nEnergy\t: " + energy + " kJ" + "\nCarbohydrate for 100g of grapes: " + carbohydrate + "g";
	}
}
