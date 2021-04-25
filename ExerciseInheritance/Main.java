package ExerciseInheritance;

public class Main {

	public static void main(String[] args) {
		Fruit objFruit = new Fruit("Fruits");
		System.out.println(objFruit);
		
		
		Apple objA = new Apple("Apple", 85, 5.8);
		System.out.println("\n");
		System.out.print("\n" + "------------------------------------APPLE-----------------------------------");
		System.out.println("\n" + objA);
		
		
		System.out.println("\n");
		System.out.print("\n" + "----------------------------------RED APPLE---------------------------------" + "\n");
		RedApple objRA = new RedApple("Red Apple", 178 , 6.7, 52, 4, 5);
		System.out.println("\n" + objRA);
		
		
		System.out.println("\n");
		System.out.print("\n" + "---------------------------------GREEN APPLE--------------------------------" + "\n");
		GreenApple objGA = new GreenApple("Green Apple", 182, 5.3, 95, 4 , 8);
		System.out.println("\n" + objGA);
		
		
		System.out.println("\n");
		System.out.print("\n\n" + "-----------------------------------GRAPES----------------------------------" + "\n");
		Grapes objG = new Grapes("Grapes", "Purple and Green", 18.1, 288);
		System.out.print("\n" + objG);
		
		
		System.out.println("\n");
		System.out.print("\n\n" + "---------------------------------STRAWBERRY--------------------------------" + "\n");
		Strawberry objS = new Strawberry("Strawberry", "small", 91, 0.67, 0.3);
		System.out.print("\n" + objS);
	}
}
