package ExerciseSuperSubClass;

public class Grapes extends Fruit{

	private String color;
	private double carbohydrate;
	private int energy;
	
	public Grapes() {
		super();
		color = " ";
		carbohydrate = 0;
		energy = 0;
	}
	
	public Grapes(String N, String C, double B, int E) { //constructor with 4 arguments
		super(N);
		color = C;
		carbohydrate = B;
		energy = E;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getCarbohydrate() {
		return carbohydrate;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public String toString() { //overriding method
		return super.toString() + "\nColor\t = " + color + 
								  "\nCarbohydrate = " + carbohydrate + "g" +
								  "\nEnergy\t = " + energy + " kJ";
	}
}
