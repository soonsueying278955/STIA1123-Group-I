package Exercise4_6;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("************************************");
		System.out.println("\t INFO OF APPLE");
		System.out.println("************************************");
		Apple a = new Apple("Apple", 60, 1.90);
		System.out.println(a);
		
		
		System.out.println();
		System.out.println("\n************************************");
		System.out.println("\tINFO OF RED APPLE");
		System.out.println("************************************");
		RedApple ra = new RedApple("Red Apple", 52, 1.30, "Red");
		System.out.println(ra);
		
		
		System.out.println();
		System.out.println("\n************************************");
		System.out.println("\t INFO OF GREEN APPLE");
		System.out.println("************************************");
		GreenApple ga = new GreenApple("Green Apple", 35, 1.05, "Sour");
		System.out.println(ga);
		
		
		System.out.println();
		System.out.println("\n************************************");
		System.out.println("\t INFO OF GRAPES");
		System.out.println("************************************");
		Grapes g = new Grapes("Grapes", 55, 2.15);
		System.out.println(g);
		
		
		System.out.println();
		System.out.println("\n************************************");
		System.out.println("\tINFO OF STRAWBERRY");
		System.out.println("************************************");
		Strawberry s = new Strawberry("Strawberry", 52, 2.99);
		System.out.println(s);
	}
}
