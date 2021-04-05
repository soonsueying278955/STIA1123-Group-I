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
		BritishShorthairCat.printGender("British Shorthair Cat", "male cat.");
		BritishShorthairCat.printWeight("British Shorthair Cat", "3 kg");
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("PERSIAN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		PersianCat.printSpec("Persian Cat", "Gray", "Short", "Smart, docile, elegant");
		PersianCat.printPlaceofOrigin("Persian Cat", "Iran");
		PersianCat.printAge("Persian Cat", "3");
		PersianCat.printGender("Persian Cat", "male cat.");
		PersianCat.printWeight("Persian Cat", "7 kg");
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("EXOTIC SHORTHAIR CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		ExoticShorthairCat.printSpec("Exotic Shorthair Cat", "Fawn", "Medium size, Short, Fat", "Quiet, Playful, Curious");
		ExoticShorthairCat.printPlaceofOrigin("Exotic Shorthair Cat", "United States");
		ExoticShorthairCat.printAge("Exotic Shorthair Cat", "2");
		ExoticShorthairCat.printGender("Exotic Shorthair Cat", "female cat.");
		ExoticShorthairCat.printWeight("Exotic Shorthair Cat", "3.8 kg");
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------------");
		System.out.println("MUNCHKIN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------------");
		MunchkinCat.printSpec("Munchkin Cat", "White", "Short leg", "Intelligent, Agility, Curious");
		MunchkinCat.printPlaceofOrigin("Munchkin Cat", "United States");
		MunchkinCat.printAge("Munchkin Cat", "2");
		MunchkinCat.printGender("Munchkin Cat", "female cat.");
		MunchkinCat.printWeight("Munchkin Cat", "3.5 kg");
		
	}

}
