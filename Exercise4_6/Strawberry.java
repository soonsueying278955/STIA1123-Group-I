package Exercise4_6;

public class Strawberry extends Apple{
	
	public Strawberry(String N, int Q, double P) {
		super(N, Q, P);
	
	}
	
	//overriding method
	public String BenefitEating() {
		return "\nStrawberry is rich in carotene and vitamin A, which can relieve night blindness.";
	}
		
	//overriding method
	public String toString() {
		return BenefitEating();
	}
}
