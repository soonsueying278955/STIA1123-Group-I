package Constructor;

public class Main {

	public static void main(String[] args) {
		
		Dog Husky = new Dog();
		System.out.println("\n");
		System.out.println("--------------------HUSKY--------------------");
		System.out.println("Breed           : " + Husky.breed);
		System.out.println("Color           : " + Husky.color);
		System.out.println("Body Type       : " + Husky.bodyType);
		System.out.println("Character       : " + Husky.character);
		System.out.println("Place of Origin : " + Husky.placeoforigin);
		System.out.println("Gender          : " + Husky.gender);
		System.out.println("Weight for dog  : " + Husky.bodyweight + "kg");
		System.out.println("Height for dog  : " + Husky.height + "cm");
		System.out.println("\n");
		
		
		Dog Corgi = new Dog("Corgi", "Fawn", "Small size", "Friendly, Bold", "Britain Wales", "Male", 12.5, 26.5);
		System.out.println("--------------------CORGI--------------------");
		System.out.println("Breed           : " + Corgi.breed);
		System.out.println("Color           : " + Corgi.color);
		System.out.println("Body Type       : " + Corgi.bodyType);
		System.out.println("Character       : " + Corgi.character);
		System.out.println("Place of Origin : " + Corgi.placeoforigin);
		System.out.println("Gender          : " + Corgi.gender);
		System.out.println("Weight for dog  : " + Corgi.bodyweight + "kg");
		System.out.println("Height for dog  : " + Corgi.height + "cm");
		System.out.println("\n");
		
		
		Dog ShibaInu = new Dog("Shiba Inu", "Fawn", "Medium size", "Obidient, Patient", "Japan", "Female", 6.8, 33);
		System.out.println("--------------------SHIBA INU--------------------");
		System.out.println("Breed           : " + ShibaInu.breed);
		System.out.println("Color           : " + ShibaInu.color);
		System.out.println("Body Type       : " + ShibaInu.bodyType);
		System.out.println("Character       : " + ShibaInu.character);
		System.out.println("Place of Origin : " + ShibaInu.placeoforigin);
		System.out.println("Gender          : " + ShibaInu.gender);
		System.out.println("Weight for dog  : " + ShibaInu.bodyweight + "kg");
		System.out.println("Height for dog  : " + ShibaInu.height + "cm");
		
	}

}
