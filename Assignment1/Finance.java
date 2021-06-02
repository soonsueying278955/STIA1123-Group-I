package Assignment1;

import java.text.DecimalFormat;

//1.3 User Define Class
public class Finance {
	
	public static DecimalFormat df2 = new DecimalFormat("0.00");

	// 1.2 Pre-Define Class
	double income, netIncome, totalIncome ,totalExpenses;
	double costofUtilities, advertisement, repair_maintenanceExpenses, comunicationExpenses, rentExpenses, otherExpenses;
	double employeeSalaries, employeeWages, employeeBenefits, insuransCost;
	double income_HealthTourism, income_SportTourism, income_CulturalTourism;
	double monthly_income, year_income;
	int month, year;
		
	// 1.4 Constructor with no argument
	public Finance() {
		incomeInfo();
	
	}

	// 1.4 Constructor with one argument
	public Finance(int m) {
		month = m;
			
		incomeInfo();
		calTotalIncome();
		calTotalExpenses();
		calNetIncome();
		
		monthly_income = year / month;
			
		System.out.println("Total monthly income is " + "RM " + df2.format(monthly_income));
			
	}
		
	// 1.4 Constructor with two argument
	public Finance(int m, int y) {
		month = m;
		year = y;
			
		incomeInfo();
		calTotalIncome();
		calTotalExpenses();
		calNetIncome();
		
		year_income = monthly_income * 12; 
	}
		
	private void incomeInfo() {
		System.out.println("\n\n********************INCOME INFORMATION********************");
	}
		
	private void calTotalIncome() {
		income_HealthTourism = 110000;
		income_SportTourism = 95000;
		income_CulturalTourism = 74000;
		
		totalIncome = income_HealthTourism + income_SportTourism + income_CulturalTourism;
			
		System.out.println("Total income for one year is " + "RM " + df2.format(totalIncome));
	}
		
	private void calTotalExpenses() {
		costofUtilities = 10600;
		advertisement = 1100;
		repair_maintenanceExpenses = 11000;
		comunicationExpenses = 800;
		rentExpenses = 700;
		otherExpenses = 900;
		employeeSalaries = 66000;
		employeeWages = 32000;
		employeeBenefits = 12000;
		insuransCost = 5800;
		
		totalExpenses = costofUtilities + advertisement + repair_maintenanceExpenses + comunicationExpenses + 
					    rentExpenses + otherExpenses + employeeSalaries + employeeWages + employeeBenefits  + insuransCost;
			
		System.out.println("Total expenses for one year is " + df2.format(totalExpenses));
	}

	private void calNetIncome() {
		netIncome = totalIncome - totalExpenses;
			
		System.out.println("Total net income for one year is " + "RM " + df2.format(netIncome));
	}
}
