package Assignment1;

// 1.3 User Define Class
public class TourismRelatedService {
	
	// 1.2 Pre-Define Class
	String companyName, address, website, email, timeofbusiness; 
	int establishYear, Telno;
	
	// 1.4 Constructor with no argument
	public TourismRelatedService() {
		companyInfo();
	}
	
	// 1.4 Constructor with one argument
	public TourismRelatedService(String n) {
		companyName = n;
		
		companyInfo();
	}
	
	// 1.4 Constructor with two argument
	public TourismRelatedService(String n, String t) {
		companyName = n;
		timeofbusiness = t;
		
		companyInfo();
	}
		

	private void companyInfo() {
		System.out.println("**********************************COMPANY INFORMATION**********************************");
		System.out.print("\nName             : " + "Meti Travel");
		System.out.print("\nAddress          : " + "No.49, Jalan APP Yan, Tanah Biru, 43300, Petaling, Kuala Lumpur.");
		System.out.print("\nEstablish Year   : " + "2007");
		System.out.print("\nTime of Business : " + "9.00 a.m - 9.00 p.m");
		System.out.print("\nWebsite          : " + "www.metitravel.com.my");
		System.out.print("\nEmail            : " + "metitravel@yahoo.com");
		System.out.print("\nFacebook         : " + "Meti Travel");
		System.out.print("\nInstagram        : " + "meti_travel07");
		System.out.print("\nNo.Tel           : " + "03-5879460");

	}
}
