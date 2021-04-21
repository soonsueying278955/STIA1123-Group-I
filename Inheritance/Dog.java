package Inheritance;

import java.util.*;

public class Dog {
	private String breed, color, place_of_origin;
	
	Scanner scan = new Scanner (System.in);
	
	public Dog(){
		System.out.print("Enter the breed of dog: ");
		this.breed = scan.nextLine();
		
		System.out.print("Enter the color of dog: ");
		this.color = scan.nextLine();
		
		System.out.print("Enter the place of origin of dog: ");
		this.place_of_origin = scan.nextLine();
		System.out.println("\n");
	}
	public Dog(String B, String C, String P) {
		this.breed = B;
		this.color = C;
		this.place_of_origin = P;
	}
	public String getBreed() {
		return this.breed;
	}
	public String getColor() {
		return this.color;
	}
	public String getPlace_Of_Origin() {
		return this.place_of_origin;
	}
	public String toString() {
		return "Breed\t\t\t\t: "+ breed + "\n" + "Color\t\t\t\t: " + color + "\n" + "Place of origin\t\t\t: " + place_of_origin ;
	}
	
}
