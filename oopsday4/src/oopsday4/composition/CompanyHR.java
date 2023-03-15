package oopsday4.composition;

public class CompanyHR {

	public static void main(String[] args) {
		Address resAdd= new Address("31","Mannath","Worli","Mumbai","400048");
		Address commAdd= new Address("32","Antela","Bandra","Mumbai","400032");
	
	
		Employee emp1 = new Employee("John Doe","Male",24,101,"Research",40000);
		System.out.println(emp1);
		
		Employee emp2 = new Employee("Jose Doe","Female",22,102,"Accounting",30000);
		System.out.println(emp2);
		
		Employee emp3 = new Employee("Job Doe","Male",23,103,"Sales",50000);
		System.out.println(emp3);
		
		Employee emp4 = new Employee("Jane Doe","Female",26,104,"Research",45000);
		System.out.println(emp4);
		
		Employee emp5 = new Employee("Jonas Doe","Female",24,105,"Accounting",60000);
		System.out.println(emp5);
		
		if(emp1.equals(emp5))
			System.out.println("they are same");
		else
			System.out.println("they are not same");
	}
	

}
