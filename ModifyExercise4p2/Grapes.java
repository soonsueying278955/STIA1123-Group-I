package ModifyExercise4p2;

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
	
	//overloading method
	public String getInfoColor(String C) {
		return "Color\t = " + C;
	}
	
	//overloading method
	public String getInfoColor(String C1, String C2) {
		return "The color of the grapes have " + C1 + " and " + C2;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public double getCarbohydrate() {
		return carbohydrate;
	}
	
	//overriding method
	public String toString() { 
		return super.toString() + "\nEnergy\t = " + energy + " kJ" + 
								  "\nCarbohydrate = " + carbohydrate + "g" + 
								  "\n" + getInfoColor("purple") + 
								  "\n" + getInfoColor("purple", "green");
	}

	//overriding method
	public String printBenefitEating() { 
		return "Eating grapes may decrease blood sugar levels and also protect against diabetes.";
	}
}
