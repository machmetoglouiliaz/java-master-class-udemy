package Challenge;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SalariedEmployee extends Employee{
	
	private double annualSalary;
	private boolean isRetired;

	public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
		super(name, birthDate, hireDate);
		
		this.annualSalary = annualSalary;
		this.isRetired = false;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public boolean isRetired() {
		return isRetired;
	}

	public void setRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}
	
	public void retire() {
		this.terminate(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
		isRetired = true;
	}
	
	public double collectPay() {
		return annualSalary / 12;
	}
}
