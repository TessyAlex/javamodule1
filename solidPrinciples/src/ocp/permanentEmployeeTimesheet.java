package ocp;

public class permanentEmployeeTimesheet implements timesheet {

	private int workedHours;
	private int totalHours;
	
	public permanentEmployeeTimesheet() {
		// TODO Auto-generated constructor stub
	}

	public permanentEmployeeTimesheet(int workedHours, int totalHours) {
		super();
		this.workedHours = workedHours;
		this.totalHours = totalHours;
	}
	
	
}
