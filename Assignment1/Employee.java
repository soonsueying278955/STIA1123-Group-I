package Assignment1;

import java.util.*;
import java.text.DecimalFormat;

//1.3 User define class
public class Employee {

	// 1.2 Pre-Define Class
	Scanner scan = new Scanner(System.in);
	public static DecimalFormat df2 = new DecimalFormat("0.00");
	
	String job_position, name, gender, email;
	int age, phone_num, salary, month;
	double totalsalary;

		
	//1.4 Constructor with no argument
	public Employee() {
		employeeInfo();
	}

	// 1.4 Constructor with one argument
	public Employee(int s) {
		salary = s;
		
		employeeInfo();
		salaryformonth();
		calSalary();
	}
		
	// 1.4 Constructor with two argument
	public Employee(String jp, int m) {
		job_position = jp;
		month = m;

		employeeInfo();
		salaryformonth();
		calSalary();
	}

	
	private void employeeInfo() {
		System.out.println("\n\n********************EMPLOYEE INFORMATION********************");
		System.out.print("Name\t\t: ");
		name = scan.nextLine();
			
		System.out.print("Age\t\t: ");
		age = scan.nextInt();
			
		System.out.print("Gender\t\t: ");
		gender = scan.next();
		scan.nextLine();
			
		System.out.print("Job Position\t: ");
		job_position = scan.nextLine();
			
		System.out.print("Phone Number\t: ");
		phone_num = scan.nextInt();
			
		System.out.print("Email\t\t: ");
		email = scan.next();
		scan.nextLine();
		
		System.out.print("Salary\t\t: ");
		salary = scan.nextInt();

		System.out.print("\nName            : " + name);
		System.out.print("\nAge             : " + age + " years old");
		System.out.print("\nGender          : " + gender);
		System.out.print("\nJob Position    : " + job_position);
		System.out.print("\nPhone Number    : " + phone_num);
		System.out.print("\nEmail           : " + email);
		System.out.print("\nMonthly salary  : " + salary);
	}
		
	private void salaryformonth() {
		totalsalary = salary * month;
		
		if(salary == 3000) {
			System.out.print("\n\nThe monthly salary for the Visitor Information Counsellor is " + "RM " + df2.format(salary));
		}
		else if(salary == 5500) {
			System.out.print("\n\nThe monthly salary for the Tourism Trainer is " + "RM " + df2.format(salary));
		}
		else if(salary == 7000) {
			System.out.print("\n\nThe monthly salary for the Manager is " + "RM " + df2.format(salary));
		}
	}
		
	private void calSalary() {
		if(job_position.equals("Visitor Information Counsellor") && month == 12) {
			System.out.println("\nTotal salary of " + month + " month is " + "RM " + df2.format(totalsalary));
		}
		else if(job_position.equals("Tourism Trainer") && month == 12) {
			System.out.println("\nTotal salary of " + month + " month is " + "RM " + df2.format(totalsalary));
		}
		else if(job_position.equals("Manager") && month == 12) {
			System.out.println("\nTotal salary of " + month + " month is " + "RM " + df2.format(totalsalary));
		}
	}
}
