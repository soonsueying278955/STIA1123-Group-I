package Exercise4_6;

public class GreenApple extends Apple{

	private String taste;
	
	public GreenApple(String N, int Q, double P, String T) {
		super(N, Q, P);
		taste = T;
	}
	
	public String Taste() {
		return taste;
	}
	
	//overriding method
	public String printInfo() {
		return "\nThe unique scent of apple can relieve bad emotions caused by excessive stress.";
	}
		
	//overriding method
	public String toString() {
		return printInfo();
	}

}
