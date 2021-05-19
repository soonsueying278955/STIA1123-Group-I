package Exercise4_6;

public abstract class Fruit {
	
	protected String name;
	
	public abstract String name();
	
	public Fruit() {
		name = " ";
	}
	
	public Fruit(String N) { //constructor with no argument
		name = N;
		System.out.println(name + " constructor is invoked.");
	}
	
	public String getNmae() {
		return name;
	}
}
