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
	
	void calculateFoodCost(String b, int f, int m) {
		double TotalFoodCost = f * m;   //f is represent 'kg' for the food cat and m represent the money for 1 beg
		System.out.printf("The total 1 beg food cost for " + b + " is " + "RM" + "%.2f", TotalFoodCost);
	}
	
	void calculateClothesCost(String b, int c, int m) {
		double TotalClothesCost = c * m;  //c is represent the quantity of clothes
		System.out.printf("\n" + "The total cost of clothes for " + b + " is " + "RM" + "%.2f", TotalClothesCost);
	}
	
	void printAge(String b, int y) {
		int age = 2021 - y;
		
		System.out.println("\n" + b + " was born on year " + y + " and it was " + age + " years old.");
		}
	}