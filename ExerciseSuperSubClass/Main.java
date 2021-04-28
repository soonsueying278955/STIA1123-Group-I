package ExerciseSuperSubClass;

public class Main {

	public static void main(String[] args) {
		
		Fruit f = new Fruit("Fruit");
		System.out.println(f);
		
		
		Apple a = new Apple("Apple", 85, 5.8);
		System.out.println("\n" + "====================APPLE====================");
		System.out.println(a);
			
		
		RedApple ra = new RedApple("Red Apple", 178, 6.7, 52, 4, 5);
		System.out.println("\n" + "==================RED APPLE==================");
		System.out.println(ra);
		
		
		GreenApple ga = new GreenApple("Green Apple", 182, 5.3, 95, 4, 8);
		System.out.println("\n" + "=================GREEN APPLE=================");
		System.out.println(ga);
		
		
		Grapes g = new Grapes("Grapes", "Purple and Green", 18.1, 288);
		System.out.println("\n" + "===================GRAPES====================");
		System.out.println(g);
		
		
		Strawberry s = new Strawberry("Strawberry", "Small", 91, 0.67, 0.3);
		System.out.println("\n" + "=================STRAWBERRY==================");
		System.out.println(s);
	}

}
