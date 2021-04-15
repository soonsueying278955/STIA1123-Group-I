package Quiz1;

import java.util.*;

public class Student {

	Scanner scan = new Scanner(System.in);
	String name;
	int age;
	String city;
	int height;
	int weight;
	
	
	// Create Setter Method
	public void setName() {
		System.out.print("Please enter student's name: ");
		this.name = scan.nextLine();
	}
	public void setAge() {
		System.out.print("Please enter student's age: ");
		this.age = scan.nextInt();
	}
	public void setCity() {
		System.out.print("Please enter student's city: ");
		this.city = scan.next();
	}
	public void setHeight() {
		System.out.print("Please enter student's height: ");
		this.height = scan.nextInt();
	}
	public void setWeight() {
		System.out.print("Please enter student's weight: ");
		this.weight = scan.nextInt();
	}
	
	
	// Create Getter Method
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
}
