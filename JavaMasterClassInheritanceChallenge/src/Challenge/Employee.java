package Challenge;

public class Employee extends Worker{
	
	private long employeeId;
	private String hireDate;

	private static int employeeNo = 0;
	public Employee(String name, String birthDate, String hireDate) {
		super(name, birthDate);
		this.employeeId = employeeNo++;
		this.hireDate = hireDate;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
}
