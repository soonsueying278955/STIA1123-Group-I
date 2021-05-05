package Exercise_4p4;

public class Fruit {

	private String name;
	
	public Fruit(String N) {
		this.name = N;
	}
	
	public String toString() {
		return "Fruit constructor is invoked" + 
			   "\nFruit\t\t = " + name;
	}
}
