package ModifyExercise4p2;

public class Main {

	public static void main(String[] args) {
		Fruit f = new Fruit("Fruit");
		System.out.println(f);
		
		
		Apple a = new Apple("Apple", 10.1, 5.8);
		System.out.println("\n" + "==============================APPLE==============================");
		System.out.println(a.toString());
		System.out.println(a.printInfo());
			
		
		RedApple ra = new RedApple("Red Apple", 12.5, 6.7, 52, 4, 5);
		System.out.println("\n" + "============================RED APPLE============================");
		System.out.println(ra.toString());
		System.out.println(ra.printInfo());
		
		
		GreenApple ga = new GreenApple("Green Apple", 14.9, 5.3, 95, 4, 8);
		System.out.println("\n" + "===========================GREEN APPLE===========================");
		System.out.println(ga.toString());
		System.out.println(ga.printInfo());
		
		
		Grapes g = new Grapes("Grapes", "purple", 18.1, 288);
		System.out.println("\n" + "=============================GRAPES==============================");
		System.out.println(g.toString());
		System.out.println(g.printBenefitEating());
		
		
		Strawberry s = new Strawberry("Strawberry", "oval", 91, 0.67, 0.3);
		System.out.println("\n" + "===========================STRAWBERRY============================");
		System.out.println(s.toString());
		System.out.println(s.BenefitEating());
	}

}
