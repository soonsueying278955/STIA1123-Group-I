package Inheritance;

public class Main {

	public static void main(String[] args) {
		Dog objRec = new Dog ();
		System.out.println(objRec);
		System.out.println();
		
		Husky objHusky = new Husky("Husky", "White", "Russian, Siberian", 2, 1500);
		System.out.println("\n" + objHusky);
		System.out.printf("Total price for dog\t\t: " + "RM " + "%.2f" ,objHusky.calTotalPrice());
		
	}

}
