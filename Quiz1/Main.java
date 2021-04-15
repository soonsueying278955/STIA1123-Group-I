package Quiz1;

public class Main {

	public static void main(String[] args) {
		
		Student John = new Student();
		Student Mary = new Student();
		
		John.setName();
		John.setAge();
		John.setCity();
		John.setHeight();
		John.setWeight();
		
		System.out.println("----------Student 1----------");
		System.out.println("Name: " + John.getName());
		System.out.println("Age: " + John.getAge());
		System.out.println("City: " + John.getCity());
		System.out.println("Height: " + John.getHeight() + " cm");
		System.out.println("Weight: " + John.getWeight() + " kg");
		System.out.println("\n");
		
		Mary.setName();
		Mary.setAge();
		Mary.setCity();
		Mary.setHeight();
		Mary.setWeight();
		
		System.out.println("\n");
		System.out.println("----------Student 2---------");
		System.out.println("Name: " + Mary.getName());
		System.out.println("Age: " + Mary.getAge());
		System.out.println("City: " + Mary.getCity());
		System.out.println("Height: " + Mary.getHeight() + " cm");
		System.out.println("Weight: " + Mary.getWeight() + " kg");
	}

}
