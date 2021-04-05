package CatProfile;

public class Cat {
	
	String breed;
	String color;
	String bodyType;
	String character;
	
	void printSpec(String b, String c, String t, String h) {
		System.out.println("Breed       : " + b);
		System.out.println("Color       : " + c);
		System.out.println("Body type   : " + t);
		System.out.println("Character   : " + h);
		
	}
	
	void printPlaceofOrigin(String b, String p) {
		System.out.println("The place of origin for " + b + " is " + p);
	}
	
	void printAge(String b, String a) {
		System.out.println("The age for " + b + " is " + a + " years old.");
	}
	
	void printeat(String b, String e) {
		System.out.println(b + " like to " + e );
	}
	
	void printsleeping(String b, String s) {
		System.out.println(b + " is " + s);
	}
}