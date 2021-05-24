package Constructor3p1;

public class Main {

	public static void main(String[] args) {
		Dog Husky = new Dog();
		System.out.println("\n");
		System.out.println("--------------------HUSKY--------------------");
		System.out.println("Breed                     : " + Husky.getBreed());
		System.out.println("Color                     : " + Husky.getColor());
		System.out.println("Body Type                 : " + Husky.getBodyType());
		System.out.println("Character                 : " + Husky.getCharacter());
		System.out.println("Place of Origin           : " + Husky.getPlaceOfOrigin());
		System.out.println("Gender                    : " + Husky.getGender());
		System.out.println("Weight for dog            : " + Husky.getBodyweight() + "kg");
		System.out.println("Height for dog            : " + Husky.getHeight() + "cm");
		System.out.println("Quantity want to purchase : " + Husky.getQuantity());
		System.out.printf("Market price per dog      : " + "RM " + "%.2f", Husky.getPrice());
		System.out.printf("\n" + "The total price you purchase is " + "RM " + "%.2f", Husky.calTotalPrice());
		System.out.println("\n");
		
		
		Dog Corgi = new Dog("Corgi", "Fawn", "Small size", "Friendly, Bold", "Britain Wales", "Male", 12.5, 26.5, 2, 1650);
		System.out.println("--------------------CORGI--------------------");
		System.out.println("Breed                     : " + Corgi.getBreed());
		System.out.println("Color                     : " + Corgi.getColor());
		System.out.println("Body Type                 : " + Corgi.getBodyType());
		System.out.println("Character                 : " + Corgi.getCharacter());
		System.out.println("Place of Origin           : " + Corgi.getPlaceOfOrigin());
		System.out.println("Gender                    : " + Corgi.getGender());
		System.out.println("Weight for dog            : " + Corgi.getBodyweight() + "kg");
		System.out.println("Height for dog            : " + Corgi.getHeight() + "cm");
		System.out.println("Quantity want to purchase : " + Corgi.getQuantity());
		System.out.printf("Market price per dog      : " + "RM " + "%.2f", Corgi.getPrice());
		System.out.printf("\n" + "The total price you purchase is " + "RM " + "%.2f", Corgi.calTotalPrice());
		System.out.println("\n");
		
		
		Dog ShibaInu = new Dog("Shiba Inu", "Fawn", "Medium size", "Obidient, Patient", "Japan", "Female", 6.8, 33, 1, 893);
		System.out.println("--------------------SHIBA INU--------------------");
		System.out.println("Breed                     : " + ShibaInu.getBreed());
		System.out.println("Color                     : " + ShibaInu.getColor());
		System.out.println("Body Type                 : " + ShibaInu.getBodyType());
		System.out.println("Character                 : " + ShibaInu.getCharacter());
		System.out.println("Place of Origin           : " + ShibaInu.getPlaceOfOrigin());
		System.out.println("Gender                    : " + ShibaInu.getGender());
		System.out.println("Weight for dog            : " + ShibaInu.getBodyweight() + "kg");
		System.out.println("Height for dog            : " + ShibaInu.getHeight() + "cm");
		System.out.println("Quantity want to purchase : " + ShibaInu.getQuantity());
		System.out.printf("Market price per dog      : " + "RM " + "%.2f", ShibaInu.getPrice());
		System.out.printf("\n" + "The total price you purchase is " + "RM " + "%.2f", ShibaInu.calTotalPrice());
	}
}

