package Test1;

interface Rebet{
	int rateOfRebet();
}

class ProtonX70 implements Rebet{
	public int rateOfRebet() {
		return 10000;
	}
}

class ProtonX50 implements Rebet{
	public int rateOfRebet() {
		return 7500;
	}
}


public interface TestInterfaceProton {
	public static void main(String [] args) {
		int priceX70 = 100000;
		int priceX50 = 80000;
		
		Rebet X70 = new ProtonX70();
		int totalPriceX70 = priceX70 - X70.rateOfRebet();
		System.out.println("Price Proton X70: " + "RM " + totalPriceX70);
		
		Rebet X50 = new ProtonX50();
		int totalPriceX50 = priceX50 - X50.rateOfRebet();
		System.out.println("Price Proton X50: " + "RM " + totalPriceX50);
	}
}

