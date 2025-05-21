package Challenge;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Worker {
	
	private String name;
	private String birthDate;
	private String endDate;
	
	public Worker(String name, String birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public int getAge() {
		LocalDate date = LocalDate.parse(birthDate);
		
		return (int)ChronoUnit.YEARS.between(date, LocalDate.now());
	}
	
	public double collectPay() {
		return 0.0;
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
	}
}
