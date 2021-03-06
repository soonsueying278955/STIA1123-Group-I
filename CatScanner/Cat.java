package CatScanner;

import java.util.*;

public class Cat {
	
	Scanner scan = new Scanner(System.in);
	
	void profile() {
		System.out.println("Enter the name, color, body type, and character of cat: ");
		String name = scan.nextLine();
		String color = scan.nextLine();
		String bodytype = scan.nextLine();
		String character = scan.nextLine();
		
		// output user input
		System.out.println("Breed of cat     : " + name);
		System.out.println("Color of cat     : " + color);
		System.out.println("Body type of cat : " + bodytype);
		System.out.println("Character of cat : " + character);
		System.out.println("\n");
	}
	
	void calculateFoodCost() {
		System.out.println("The food cost for cat");
		System.out.print("Enter the kg of beg of food for cat: ");
		int food = scan.nextInt();
		
		System.out.print("Enter the cost for cat food: ");
		int cost = scan.nextInt();
		
		//Calculate the food cost for cat
		double money_for_food = food * cost;		 
		
		System.out.printf("The food cost for cat is " + "RM" + "%.2f", money_for_food);
		System.out.println("\n");
		System.out.println("");
	}
	
	void calculateClothesCost() {
		System.out.println("Enter the clothes cost for cat:");
		System.out.print("Shirt: ");
		int shirt = scan.nextInt();
		
		System.out.print("Hat: ");
		int hat = scan.nextInt();
		
		//Calculate the clothes cost for cat
		double s = shirt * 3;	  // s represent shirt and 3 is represent the quantity of shirt
		double h = hat * 2;       // h represent hat
		double amount = s + h;
		
		System.out.printf("The shirt cost for cat is " + "RM" + "%.2f", s);
		System.out.print("\n");
		System.out.printf("The hat cost for cat is " + "RM" + "%.2f", h);
		System.out.print("\n");
		System.out.printf("Total for clothes cost is " + "RM" + "%.2f", amount);
		System.out.println("\n");
	}
	
	void calculateSpeed() {
		float speed;
		float kph;
		
		System.out.print("Enter the distance in meters: ");
		float distance = scan.nextFloat();
		
		System.out.print("Enter the hour: ");
		float hour = scan.nextFloat();
		
		System.out.print("Enter the minutes: ");
		float min = scan.nextFloat();
		
		System.out.print("Enter the seconds: ");
		float sec = scan.nextFloat();
		
		speed = (hour*3600) + (min*60) + sec;
		kph = (distance/500) / (speed/3600);
		
		System.out.println("The speed of cat in km/h is " + kph);
		
	}
}


