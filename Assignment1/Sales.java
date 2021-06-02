package Assignment1;

import java.util.*;
import java.text.DecimalFormat;

//1.3 User Define Class
public class Sales {
	
	// 1.2 Pre-Define Class
	Scanner scan = new Scanner(System.in);
	public static DecimalFormat df2 = new DecimalFormat("0.00");
		
	String firstname, lastname, gender, email, city, state, tourism, service;
	int age, hour, price;
	int phone_num;
	double TotalPrice, Discount, PriceafterDiscount;

	// 1.4 Constructor with no argument
	public Sales() {
		clientInfo();
		
	}
		
	// 1.4 Constructor with one argument
	public Sales(int h) {
		hour = h;
			
		clientInfo();
		bookingInfo();
	
	}
		
	// 1.4 Constructor with two argument
	public Sales(int h, double d) {
		hour = h;
		Discount = d;
			
		clientInfo();
		bookingInfo();
		calTotalPrice();
		Discount();
	}
		
	private void clientInfo() {
		System.out.println("\n******************************CLIENT INFORMATION******************************");
		System.out.print("Please fill in your information");
		System.out.print("\nFirst Name\t: ");
		firstname = scan.nextLine();
			
		System.out.print("Last Name\t: ");
		lastname = scan.nextLine();
			
		System.out.print("Age\t\t: ");
		age = scan.nextInt();
			
		System.out.print("Gender\t\t: ");
		gender = scan.next();
		scan.nextLine();
			
		System.out.print("Phone Num\t: ");
		phone_num = scan.nextInt();
			
		System.out.print("Email\t\t: ");
		email = scan.next();
		scan.nextLine();
			
		System.out.print("City\t\t: ");
		city = scan.nextLine();
			
		System.out.print("State\t\t: ");
		state = scan.nextLine();
			
		System.out.print("\nFirst Name     : " + firstname);
		System.out.print("\nLast Name      : " + lastname);
		System.out.print("\nAge            : " + age + " years old");
		System.out.print("\nGender         : " + gender);
		System.out.print("\nPhone Number   : " + phone_num);
		System.out.print("\nEmail          : " + email);
		System.out.print("\nCity           : " + city);
		System.out.print("\nState          : " + state);
	}
		
	private void bookingInfo() {
		System.out.println("\n");
		System.out.print("\n******************************BOOKING INFORMATION******************************");
		System.out.print("\nType of tourism : ");
		tourism = scan.nextLine();
			
		System.out.print("Type of service : ");
		service = scan.nextLine();
			
		System.out.print("Price\t\t: ");
		price = scan.nextInt();
			
		System.out.print("Hour\t\t: ");
		hour = scan.nextInt();
			
		System.out.print("\nType of tourism : " + tourism);
		System.out.print("\nType of service : " + service);
		System.out.print("\nPrice           : " + "RM " + df2.format(price) + " per person");
		System.out.print("\nHour            : " + hour);
	}

	private void calTotalPrice() {
		TotalPrice = price * hour;
		System.out.printf("\n\nTotal price for " + hour + " hours of " + tourism + ", " + service + " is RM " + df2.format(TotalPrice));
	}

	private void Discount() {
		if(hour >= 5) {
			System.out.println("\nIf hour is more than 5, you will get 20% discount.");
			
			PriceafterDiscount = TotalPrice * (1 - Discount);
			System.out.println("Total price after discount is " + "RM " + df2.format(PriceafterDiscount));
		}
		else{
			System.out.println("\nIf hour is less than 5, you will not get any discount.");
		}
	}
}
