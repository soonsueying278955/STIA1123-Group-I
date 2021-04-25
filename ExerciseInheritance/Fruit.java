package ExerciseInheritance;

public class Fruit {

	private String name;
	
	public Fruit(String name) {
		this.name = name;
		System.out.println(name + " constructor is invoked");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String toString() {
		return "Fruit\t: " + name;
	}
}
