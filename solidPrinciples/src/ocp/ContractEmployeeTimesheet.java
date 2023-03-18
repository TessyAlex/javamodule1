package ocp;

public class ContractEmployeeTimesheet implements timesheet {

	private int workedHours;
	private int totalHours;
	
	public ContractEmployeeTimesheet() {
		// TODO Auto-generated constructor stub
	}

	public ContractEmployeeTimesheet(int workedHours, int totalHours) {
		super();
		this.workedHours = workedHours;
		this.totalHours = totalHours;
	}
	
}
