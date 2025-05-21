package Challenge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalariedEmployee sEmployee = new SalariedEmployee("Mourat", "1991-01-14", "2005-05-05", 120000);
		HourlyEmployee hEmployee = new HourlyEmployee("Mourat", "1991-01-14", "2005-05-05", 25);
		
		sEmployee.retire();
		hEmployee.getDoublePay();
	}

}
