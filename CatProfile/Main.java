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
		BritishShorthairCat.printPlaceofOrigin("British Shorthair Cat", "United Kingdom");
		BritishShorthairCat.printAge("British Shorthair Cat", "1");
		BritishShorthairCat.printeat("British Shorthair Cat", "eat two fish.");
		BritishShorthairCat.printsleep("British Shorthair Cat", "sleep in the morning.");
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("PERSIAN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		PersianCat.printSpec("Persian Cat", "Gray", "Short", "Smart, docile, elegant");
		PersianCat.printPlaceofOrigin("Persian Cat", "Iran");
		PersianCat.printAge("Persian Cat", "3");
		PersianCat.printeat("Persian Cat", "eat the cat food.");
		PersianCat.printsleep("Persian Cat", "sleep on the sofa.");
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("EXOTIC SHORTHAIR CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		ExoticShorthairCat.printSpec("Exotic Shorthair Cat", "Fawn", "Medium size, Short, Fat", "Quiet, Playful, Curious");
		ExoticShorthairCat.printPlaceofOrigin("Exotic Shorthair Cat", "United States");
		ExoticShorthairCat.printAge("Exotic Shorthair Cat", "2");
		ExoticShorthairCat.printeat("Exotic Shorthair Cat", "eat the food it like and don't eat the food it don't like.");
		ExoticShorthairCat.printsleep("Exotic Shorthair Cat", "don't like to sleep and it like to play.");
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("MUNCHKIN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		MunchkinCat.printSpec("Munchkin Cat", "White", "Short leg", "Intelligent, Agility, Curious");
		MunchkinCat.printPlaceofOrigin("Munchkin Cat", "United States");
		MunchkinCat.printAge("Munchkin Cat", "2");
		MunchkinCat.printeat("Munchkin Cat", "eat the fish and also the cat food.");
		MunchkinCat.printsleep("Munchkin Cat", "sleep in the morning.");
		
	}

}
