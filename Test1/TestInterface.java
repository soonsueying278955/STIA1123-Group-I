package Test1;

interface BNM { //This super class is a interface automatically defined as a abstract
	float rateOfInterest(); //This method also automatically defined as a abstract, no need put abstract 
	void display();
}

class PublicBank implements BNM {
	public float rateOfInterest() {
		return 5.5f;
	}
	
	public void display() {
		System.out.println("This is Public Bank");
	}
}

class RHBBank implements BNM {
	public float rateOfInterest() {
		return 6.5f;
	}
	public void display() {
		System.out.println("This is RHB Bank");
	}
}

public interface TestInterface {
	public static void main(String [] args) {
		BNM PB = new PublicBank();
		PB.display();
		System.out.println("ROI for Public Bank: " + PB.rateOfInterest());
		
		BNM RHB = new RHBBank();
		RHB.display();
		System.out.println("ROI for RHB Bank: " + RHB.rateOfInterest());
	}
}
