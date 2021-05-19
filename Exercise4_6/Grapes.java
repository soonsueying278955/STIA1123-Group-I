package Exercise4_6;

public class Grapes extends Apple{
	
	public Grapes(String N, int Q, double P) {
		super(N, Q, P);
	}
	
	//overriding method
	public String printBenefitEating() { 
		return "\nEating grapes may decrease blood sugar levels and also protect against diabetes.";
	}
		
	//overriding method
	public String toString() {
		return printBenefitEating();
	}
}
