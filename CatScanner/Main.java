package CatScanner;

public class Main {

	public static void main(String[] args) {
		Cat BritishShorthairCat = new Cat();
		Cat ExoticShorthairCat = new Cat();
		Cat PersianCat = new Cat();
		Cat MunchkinCat = new Cat();
		
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("BRITISH SHORTHAIR CAT SPECIFICATION");
		System.out.println("-----------------------------------------------------------------------------------");
		BritishShorthairCat.profile();
		BritishShorthairCat.calculateFoodCost();
		BritishShorthairCat.calculateClothesCost();
		BritishShorthairCat.calculateSpeed();
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------");
		System.out.println("EXOTIC SHORTHAIR CAT SPECIFICATION");
		System.out.println("-----------------------------------------------------------------------------------");
		ExoticShorthairCat.profile();
		ExoticShorthairCat.calculateFoodCost();
		ExoticShorthairCat.calculateClothesCost();
		ExoticShorthairCat.calculateSpeed();
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------");
		System.out.println("PERSIAN CAT SPECIFICATION");
		System.out.println("-----------------------------------------------------------------------------------");
		PersianCat.profile();
		PersianCat.calculateFoodCost();
		PersianCat.calculateClothesCost();
		PersianCat.calculateSpeed();
		
		
		System.out.println("\n" + "-----------------------------------------------------------------------------------");
		System.out.println("MUNCHKIN CAT SEPCIFICATION");
		System.out.println("-----------------------------------------------------------------------------------");
		MunchkinCat.profile();
		MunchkinCat.calculateFoodCost();
		MunchkinCat.calculateClothesCost();
		MunchkinCat.calculateSpeed();
	}

}
