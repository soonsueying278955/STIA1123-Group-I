package Constructor;

import java.util.*;

public class Dog {
	
	Scanner scan = new Scanner(System.in);
	
	String breed, color, bodyType,character, placeoforigin, gender;
	double bodyweight, height;
	
	//Default constructor
	Dog(){
		System.out.print("Enter the breed for dog: ");
		this.breed = scan.nextLine();
		
		System.out.print("Enter the color for dog: ");
		this.color = scan.nextLine();
		
		System.out.print("Enter the body type for dog: ");
		this.bodyType = scan.nextLine();
		
		System.out.print("Enter the character for dog: ");
		this.character = scan.nextLine();
		
		System.out.print("Enter the place of origin for dog: ");
		this.placeoforigin = scan.nextLine();
		
		System.out.print("Enter the gender for a dog: ");
		this.gender = scan.nextLine();
		
		System.out.print("Enter body weight for dog: ");
		this.bodyweight = scan.nextInt();
		
		System.out.print("Enter the height for dog:");
		this.height = scan.nextInt();
	}
	
	//Parameterized constructor
	Dog(String b, String c, String t, String h, String p, String g, double w, double i){
		this.breed = b;
		this.color = c;
		this.bodyType = t;
		this.character = h;
		this.placeoforigin = p;
		this.gender = g;
		this.bodyweight = w;
		this.height = i;
	}
	
}
