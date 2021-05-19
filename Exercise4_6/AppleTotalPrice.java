package Exercise4_6;

class AppleTotalPrice implements Price{
	
	double a = 1.59; //This represents price for quantity apple is more than 10 but less than 50
	double a2= 1.40; //This represent price of quantity apple is more than 50
	
	public double totalPrice(int Q) {
		return a * Q;
	}
	public double totalPrice(int Q, double d) {
		return (a2 * Q) * (1 - d);
	}
} 


class GrapesTotalPrice implements Price{
	
	double g = 2.09; //This represents price for quantity grapes is more than 10 but less than 50
	double g2 = 1.99; //This represent price of quantity grapes is more than 50
	
	public double totalPrice(int Q) {
		return g * Q;
	}
	public double totalPrice(int Q, double d) {
		return (g2 * Q) * (1 - d);
	}
}


class StrawberryTotalPrice implements Price{
	
	double s = 2.59; //This represents price for quantity strawberry is more than 10 but less than 50
	double s2 = 2.30; //This represent price of quantity strawberry is more than 50
	
	public double totalPrice(int Q) {
		return s * Q;
	}
	public double totalPrice(int Q, double d) {
		return (s2 * Q) * (1 - d);
	}
}
