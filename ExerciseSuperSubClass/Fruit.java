package ExerciseSuperSubClass;

public class Fruit { //super class

	private String name;
	
	public Fruit() { //constructor with no argument
		name = " " ;
	}
	
	public Fruit(String N) { //constructor with argument
		name = N;
		
		setName(N); //call method
	}
	
	public void setName(String name) {
		name = " ";
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return "Fruit constructor is invoked" + 
			   "\nFruit\t = " + name;
	}
}
