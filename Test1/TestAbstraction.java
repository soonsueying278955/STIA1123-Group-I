package Test1;

abstract class BankNegaraMalaysia{ //This is a super class define as a abstract
	
	abstract float rateOfInterest(); //Since the super class is abstract then the method also abstract, method with no body. 
	   								 //This is a method with heading only and no implementation
}

class BankRakyat extends BankNegaraMalaysia {
	
	public float rateOfInterest() { //This is method with heading and implementation
		return 9.15f; //return float value
	}
}

class MayBank extends BankNegaraMalaysia {
	
	public float rateOfInterest() { //This is method with heading and implementation
		return 7.15f; //return float value
	}
}

public class TestAbstraction {
	public static void main(String [] args) {
		BankRakyat BR = new BankRakyat();
		MayBank MB = new MayBank();
		System.out.println("ROI for Bank Rakyat: " + BR.rateOfInterest());
		System.out.println("ROI for Bank Rakyat: " + MB.rateOfInterest());
	}
}
