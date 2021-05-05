package Exercise_4p4;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==================================== APPLE ====================================");
		Apple a = new Apple("Apple", 2.90, 20);
		System.out.println("\n" + a);
		
		
		System.out.println("\n" + "================================== RED APPLE ==================================");
		RedApple ra = new RedApple("Red Apple", 4.30, 15, 6.7, 5.3);
		System.out.println("\n" + ra);

		
		System.out.println("\n" + "================================= GREEN APPLE =================================");
		GreenApple ga = new GreenApple("Green Apple", 4.80, 12, 6.8, 5.8);
		System.out.println("\n" + ga);
		
		
		System.out.println("\n" + "==================================== GRAPES ====================================");
		Grapes g = new Grapes("Grapes", "Purple", 82);
		System.out.println(g);
		
		
		System.out.println("\n" + "================================== STRAWBERRY ==================================");
		Strawberry s = new Strawberry("Strawberry", "Small", 0.67, 0.3);
		System.out.println(s);
	}

}
