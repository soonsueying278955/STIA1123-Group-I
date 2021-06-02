package Assignment1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi, Welcome to Meti Travel - Tourism-related Service.");

		System.out.println(" ");
		TourismRelatedService T = new TourismRelatedService("Meti Travel", "9.00 a.m - 9.00 p.m");
		
		ProductDescription H = new ProductDescription("Health Tourism", "Dentistry");
	
		Employee E1 = new Employee("Tourism Trainer", 12);
		Employee E2 = new Employee("Visitor Information Counsellor", 12);
		Employee E3 = new Employee("Manager", 12);
		
		AdvertisementNMarketing A = new AdvertisementNMarketing("Brochure", "good and the best");
		
		Sales S = new Sales(6, 0.20);
		
		Finance F = new Finance(12, 1);
	}
}
