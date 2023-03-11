package userdefinedobjects;

import java.util.ArrayList;

public class TestEmpArrayList {

	public static void main(String[] args) {
		ArrayList<Employee> empList= new ArrayList<Employee>();
		
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		Employee emp2 = new Employee("Jose Doe","Female",22,102,"Accounting",30000);
		Employee emp3 = new Employee("Job Doe","Male",23,103,"Sales",50000);
		Employee emp4 = new Employee("Jane Doe","Female",26,104,"Research",45000);	
		Employee emp5 = new Employee("Jonas Doe","Female",24,105,"Accounting",60000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList.size());
	}

}
