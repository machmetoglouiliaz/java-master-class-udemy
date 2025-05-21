package Challenge;

public class HourlyEmployee extends Employee{

	private double hourlyPayRate;

	public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
		super(name, birthDate, hireDate);
		// TODO Auto-generated constructor stub
		
		this.hourlyPayRate = hourlyPayRate;
	}

	public double getHourlyPayRate() {
		return hourlyPayRate;
	}

	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	
	@Override
	public double collectPay() {
		return 48 * hourlyPayRate;
	}
	public double getDoublePay() {
		return 2 * collectPay();
	}
}
