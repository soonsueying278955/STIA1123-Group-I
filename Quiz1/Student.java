package Quiz1;

public class Student {

	String name;
	int age;
	String city;
	int height;
	int weight;
	
	
	// Create Setter Method
	public void setName(String name) {
		System.out.print("Please enter student's name: ");
		this.name = name;
	}
	public void setAge(int age) {
		System.out.print("Please enter student's age: ");
		this.age = age;
	}
	public void setCity(String city) {
		System.out.print("Please enter student's city: ");
		this.city = city;
	}
	public void setHeight(int height) {
		System.out.print("Please enter student's height: ");
		this.height = height;
	}
	public void setWeight(int weight) {
		System.out.print("Please enter student's weight: ");
		this.weight = weight;
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
