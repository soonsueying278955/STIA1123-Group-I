package ModifyExercise4p2;

public class Apple extends Fruit{

	protected double weight;
	protected double calories;

	public Apple() { //constructor for sub class
		super(); //inherit data,method from super class( constructor with no argument)
	}

	public Apple(String N, double W, double C) { //constructor sub class with argument
		super(N); //called method in superclass with passing parameter
		weight = W;
		calories = C;
	}

	public double getCalories() {
		return calories;
	}

	public double getWeight() {
		return weight;
	}

	//overloading method
	public double TotalCalories(double C, double W) {
		return calories * weight;
	}

	//overloading method
	public double AveWeight(int Q) {
		return  weight * Q;
	}

	//overriding method
	public String toString() {
		return ("Weight\t = " + weight + " g" + "\nCalories = " + calories + "kcal" + 
				"\nThe average weight of 5 apples\t = " + AveWeight(5) + " g" + 
				"\nTotal calories for 5 apples\t = " + TotalCalories(5.8, 10.1) + "kcal");
	}

	//overriding method
	public String printInfo() {
		return "An apple is the fruit that contains high protein.";
	}
}
