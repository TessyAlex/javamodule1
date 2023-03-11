package userdefinedobjects;

import java.util.HashSet;

public class TestHashSet {
// set wont take duplicate values, it will ignore it	

		public static void main(String[] args) {
			HashSet<Employee> empSet= new HashSet<Employee>();
			
			Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
			Employee emp2 = new Employee("Jose Doe","Female",22,102,"Accounting",30000);
			Employee emp3 = new Employee("Job Doe","Male",23,103,"Sales",50000);
			Employee emp4 = new Employee("Jane Doe","Female",26,104,"Research",45000);	
			Employee emp5 = new Employee("Jonas Doe","Female",24,105,"Accounting",60000);
			
			empSet.add(emp1);
			empSet.add(emp2);
			empSet.add(emp3);
			empSet.add(emp4);
			empSet.add(emp5);
			
			System.out.println(empSet.size());
		}

	}


	