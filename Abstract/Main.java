package Abstract;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("==================================== APPLE ====================================");
		Apple a = new Apple("Apple" , 1.37, 50);
		System.out.println("\n" + a);
		
		
		System.out.println("\n" + "================================== RED APPLE ==================================");
		RedApple ra = new RedApple("Red Apple", 8, 1.58,  6.7, 5.3);
		System.out.println("\n" + ra);

		
		System.out.println("\n" + "================================= GREEN APPLE =================================");
		GreenApple ga = new GreenApple("Green Apple", 25, 1.80,  6.8, 5.8);
		System.out.println("\n" + ga);
		
		
		System.out.println("\n" + "==================================== GRAPES ====================================");
		Grapes g = new Grapes("Grapes", 82, 20);
		System.out.println(g);
		
		
		System.out.println("\n" + "================================== STRAWBERRY ==================================");
		Strawberry s = new Strawberry("Strawberry", 0.34, 50);
		System.out.println(s);
	}
}
