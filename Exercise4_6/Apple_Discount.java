package Exercise4_6;

class Apple_Discount implements Discount{
	public double rate_of_discount() {
		return 0.1; //discount 10%
	}
}

class Grapes_Discount implements Discount{
	public double rate_of_discount() {
		return 0.15; //discount 15%
	}
}

class Strawberry_Discount implements Discount{
	public double rate_of_discount() {
		return 0.20; //discount 20%
	}
}
