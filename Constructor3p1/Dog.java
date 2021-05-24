package Constructor3p1;

import java.util.Scanner;

public class Dog {
	
	Scanner scan = new Scanner(System.in);
	
	private String breed, color, bodyType,character, placeoforigin, gender;
	private double bodyweight, height, price;
	private int quantity;
	
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
		this.bodyweight = scan.nextDouble();
		
		System.out.print("Enter the height for dog: ");
		this.height = scan.nextDouble();
		
		System.out.print("Please enter the quantity you want to purchase: ");
		this.quantity = scan.nextInt();
		
		System.out.print("The market price for dog: ");
		this.price = scan.nextDouble();
	}
	
	public double calTotalPrice() {
		return this.price * this.quantity;
	}
	
	//Parameterized constructor
	Dog(String b, String c, String t, String h, String p, String g, double w, double i, int q, double m){
		this.breed = b;
		this.color = c;
		this.bodyType = t;
		this.character = h;
		this.placeoforigin = p;
		this.gender = g;
		this.bodyweight = w;
		this.height = i;
		this.quantity = q;
		this.price = m;
	}
	
	//Create Get Method
	public String getBreed(){
		return this.breed;
	}
	public String getColor(){
		return this.color;
	}
	public String getBodyType(){
		return this.bodyType;
	}
	public String getCharacter(){
		return this.character;
	}
	public String getPlaceOfOrigin(){
		return this.placeoforigin;
	}
	public String getGender(){
		return this.gender;
	}
	public double getBodyweight(){
		return this.bodyweight;
	}
	public double getHeight(){
		return this.height;
	}
	public int getQuantity(){
		return this.quantity;
	}
	public double getPrice(){
		return this.price;
	}
}
