package Quiz1;

public class Main {

	public static void main(String[] args) {
		
		Student John = new Student();
		Student Mary = new Student();
		
		John.setName("John");
		John.setAge(15);
		John.setCity("Ipoh");
		John.setHeight(180);
		John.setWeight(80);
		
		System.out.println("----------Student 1----------");
		System.out.println("Name: " + John.getName());
		System.out.println("Age: " + John.getAge());
		System.out.println("City: " + John.getCity());
		System.out.println("Height: " + John.getHeight() + " cm");
		System.out.println("Weight: " + John.getName() + " kg");
		System.out.println("\n");
		
		Mary.setName("Mary");
		Mary.setAge(15);
		Mary.setCity("Taiping");
		Mary.setHeight(165);
		Mary.setWeight(45);
		
		System.out.println("\n");
		System.out.println("----------Student 2---------");
		System.out.println("Name: " + Mary.getName());
		System.out.println("Age: " + Mary.getAge());
		System.out.println("City: " + Mary.getCity());
		System.out.println("Height: " + Mary.getHeight() + " cm");
		System.out.println("Weight: " + Mary.getName() + " kg");
	}

}
