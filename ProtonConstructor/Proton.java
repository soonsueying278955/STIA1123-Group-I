package ProtonConstructor;

import java.util.*;

public class Proton {

	String brand;
	String color;
	int maxSpeed;
	
	Scanner s = new Scanner(System.in);
	//default constructor
	//Proton p = new Proton();
	
	Proton(){
		System.out.print("Enter Max Speed: ");
		this.maxSpeed = s.nextInt();
		s.nextLine();
		
		System.out.print("Enter Brand: ");
		this.brand = s.nextLine();
		
		System.out.print("Enter Color: ");
		this.color = s.nextLine();
	}

	//Parameterized constructor
	Proton(String b, String c, int s){
		this.brand = b;
		this.color = c;
		this.maxSpeed = s;
	}
}
