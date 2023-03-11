package userdefinedobjects;

import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class TestEmpTreeSet {
	// set wont take duplicate values, it will ignore it

	public static void main(String[] args) {
		
		
			TreeSet<Employee> empTree= new TreeSet<Employee>();
			
			Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
			Employee emp2 = new Employee("Jose Doe","Female",22,102,"Accounting",30000);
			Employee emp3 = new Employee("Job Doe","Male",23,103,"Sales",50000);
			Employee emp4 = new Employee("Jane Doe","Female",26,104,"Research",45000);	
			Employee emp5 = new Employee("John Doe","Male",24,101,"Research",40000);
			
			empTree.add(emp1);
			empTree.add(emp2);
			empTree.add(emp3);
			empTree.add(emp4);
			empTree.add(emp5);
			
			
		}

	}




