package ExerciseSuperSubClass;

public class Apple extends Fruit{ //sub class

	protected double weight;
	protected double calories;
	
	public Apple() { //constructor for sub class
		super(); //inherit data,method from super class( constructor with no argument)
		weight = 0;
		calories = 0;
	}
	
	public Apple(String N, double W, double C) { //constructor sub class with argument
		super(N); //called method in superclass with passing parameter
		weight = W;
		calories = C;
		
		//apple
		setInfo(N, W, C); //method for overloading
	}
	
	public void setInfo(String N, double W, double C){ //overloading method with 3 parameter
		if (W >= 0)
			weight = W;
		else
			weight = 0;
		
		
		if (C >= 0)
			calories = C;
		else
			calories = 0;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double getCalories() {
		return calories;
	}
	
	public String toString() { //overloading method
		return super.toString() + "\nWeight\t = " + weight + " grams" +
								  "\nCalories = " + calories + "kcal";
	}
}
