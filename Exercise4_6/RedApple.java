package Exercise4_6;

public class RedApple extends Apple{
	
	private String color;
	
	public RedApple(String N, int Q, double P, String C) {
		super(N, Q, P);
		this.color = C;
	}
	
	public String Color() {
		return color;
	}
	
	//overriding method
	public String printBenefit() {
		return "\nThe unique scent of apple can relieve bad emotions caused by excessive stress.";
	}
	
	//overriding method
	public String toString() {
		return printBenefit();
	}

}
