package Example3;

public class Main {

	public static void main(String[] args) {
		
		Animal Cat = new Animal();
		Cat.breed = "British shorthair cat";
		Cat.color = "White";
		Cat.bodyType = "Chubby";
		Cat.character = "Docile, Bold, Curious";
		System.out.println("------------------------------------");
		System.out.println("Animal: Cat");
		System.out.println("------------------------------------");
		System.out.println("Breed: " + Cat.breed);
		System.out.println("Color: " + Cat.color);
		System.out.println("Body type: " + Cat.bodyType);
		System.out.println("Character: " + Cat.character);
		System.out.println();
		

		Animal Dog = new Animal();
		Dog.breed = "Siberian Husky";
		Dog.color = "White";
		Dog.bodyType = "Medium";
		Dog.character = "Friendly, enthusiastic";
		System.out.println("------------------------------------");
		System.out.println("Animal: Dog");
		System.out.println("------------------------------------");
		System.out.println("Breed: " + Dog.breed);
		System.out.println("Color: " + Dog.color);
		System.out.println("Body type: " + Dog.bodyType);
		System.out.println("Character: " + Dog.character);
		System.out.println();
		
		
		Animal.eat();
		Animal.sleep();
		Animal.walk();
		Animal.jump();
		Animal.sit();
		Animal.climb();
		Animal.run();
		System.out.println();

		Handphone iPhone = new Handphone();
		iPhone.brand = "iPhone";
		iPhone.model = "Pro Max";
		iPhone.color = "Gold";
		System.out.println("------------------------------------");
		System.out.println("Handphone: iPhone");
		System.out.println("------------------------------------");
		System.out.println("Brand:" + iPhone.brand);
		System.out.println("Model: " + iPhone.model);
		System.out.println("Color: " + iPhone.color);
		System.out.println();
		
		
		Handphone Vivo = new Handphone();
		Vivo.brand = "Vivo";
		Vivo.model = "V20 SE";
		Vivo.color = "Aquamarine Green";
		System.out.println("------------------------------------");
		System.out.println("Handphone: Vivo" );
		System.out.println("------------------------------------");
		System.out.println("Brand:" + Vivo.brand);
		System.out.println("Model: " + Vivo.model);
		System.out.println("Color: " + Vivo.color);
		System.out.println();
		
		
		Handphone.call();
		Handphone.listenMusic();
		Handphone.sendMessage();
		Handphone.receiveMessage();
		Handphone.playGame();
		Handphone.changeVolume();
	}

}
