package Abstract;

class Apple_Discount implements Discount{
	public double rate_of_discount() {
		return 10;
	}
}

class Grapes_Discount implements Discount{
	public double rate_of_discount() {
		return 15;
	}
}

class Strawberry_Discount implements Discount{
	public double rate_of_discount() {
		return 20;
	}
}