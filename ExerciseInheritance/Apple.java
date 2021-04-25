package ExerciseInheritance;

public class Apple extends Fruit{  //sub class for fruit

	protected double weight;
	protected double calories;
	
	public Apple (String name, double w, double c) {
		super(name); // super class
		weight = w;
		calories = c;
	
	}
	
	public double totalWeight() {
		return this.weight;
	}
	
	public double totalCalories() {
		return this.calories;
	}
	
	public String toString() {
		return super.toString() + "\nWeight\t: " +  weight + " grams" + "\nCalories for 100g of apple: " + calories + "kcal"; 
	}
}
