package Abstract;

public abstract class Fruit {
	//Define super class as abstract class because don't need to create instance of fruit.
	//Class which declare as abstract cannot create instance object.
	
	private String name;
	
	public Fruit(String N) {
		this.name = N;
		System.out.println(name + " constructor is invoked.");
	}
	
	//Declare method that has no implementation
	//Only subclass know how to implement the method
	public abstract double totalPrice(); //define method as abstract, only have heading with no body
	
}
