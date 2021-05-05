package Exercise_4p4;

public class Grapes extends Fruit{

	private String color;
	private int water;
	
	public Grapes(String N, String C, int W) {
		super(N);
		this.color = C;
		this.water = W;
		
		switch(color) {
		case "Purple" :
			System.out.println(Color(82));
			break;
			
		case "Green" :
			System.out.println(Color("Green", 82));
			break;
		}
	}
	
	public String Color(int W) {
		return "Color\t\t : " + color + "\nWater\t\t : " + water + "%";
	}
	
	public String Color(String C, int W) {
		return "\nColor\t\t : " + C + "\nWater\t\t : " + W + "%";
	}
	
	//overriding method
	public String printBenefitEating() { 
		return "Eating grapes may decrease blood sugar levels and also protect against diabetes.";
	}
	
	//overriding method
	public String toString() {
		return printBenefitEating();
	}
}
