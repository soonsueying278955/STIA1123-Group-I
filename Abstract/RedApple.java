package Abstract;

public class RedApple extends Apple{
	private double fiber;
	private double calories;
	
	
	public RedApple(String N, double P, double Q, double F, double C) {
		super(N, P, Q);
		this.fiber = F;
		this.calories = C;
		
	}
	
	public double fiber() {
		return this.fiber;
	}
	
	public double calories() {
		return this.calories;
	}
	
	//overriding method
	public String printInfo() {
		return "The unique scent of apple can relieve bad emotions caused by excessive stress.";
	}
	
	//overriding method
	public String toString() {
		return printInfo();
	}
}
