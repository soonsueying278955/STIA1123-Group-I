package CatProfile;

public class Main {

	public static void main(String[] args) {
		
		Cat BritishShorthairCat = new Cat();
		Cat PersianCat = new Cat();
		Cat ExoticShorthairCat = new Cat();
		Cat MunchkinCat = new Cat();
		
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("BRITISH SHORTHAIR CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		BritishShorthairCat.printSpec("Brithish Shorthair Cat", "White", "Chubby", "Bold, docile, curious");
		BritishShorthairCat.calculateFoodCost("British Shorthair Cat", 10, 15);
		BritishShorthairCat.calculateClothesCost("British Shorthair Cat", 5, 11);
		BritishShorthairCat.printAge("British Shorthair Cat", 2010);
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("PERSIAN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		PersianCat.printSpec("Persian Cat", "Gray", "Short", "Smart, docile, elegant");
		PersianCat.calculateFoodCost("Persian Cat", 10, 18);
		PersianCat.calculateClothesCost("Persian Cat", 2, 6);
		PersianCat.printAge("Persian Cat", 2004);
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("EXOTIC SHORTHAIR CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		ExoticShorthairCat.printSpec("Exotic Shorthair Cat", "Fawn", "Medium size, Short, Fat", "Quiet, Playful, Curious");
		ExoticShorthairCat.calculateFoodCost("Exotic Shorthair Cat", 10, 13);
		ExoticShorthairCat.calculateClothesCost("Exotic Shorthair Cat", 4, 7);
		ExoticShorthairCat.printAge("Exotic Shorthair Cat", 2006);
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("MUNCHKIN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		MunchkinCat.printSpec("Munchkin Cat", "White", "Short leg", "Intelligent, Agility, Curious");
		MunchkinCat.calculateFoodCost("Munchkin Cat", 10, 16);
		MunchkinCat.calculateClothesCost("Munchkin Cat", 3, 9);
		MunchkinCat.printAge("Munchkin Cat", 2009);
		
	}

}
