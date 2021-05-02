package ModifyExercise4p2;

public class Fruit { // super class
	
private String name;
	
	public Fruit() { //constructor with no argument
		name = " " ;
	}
	
	public Fruit(String N) { //constructor with argument
		name = N;
		
		setName(N); //call method
	}
	
	public void setName(String name) { // overloading method
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
