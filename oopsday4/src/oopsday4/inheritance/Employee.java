package oopsday4.inheritance;

import java.util.Objects;

public class Employee extends Person {
	private long empId;
	private String deptNo;
	private double salary;

public Employee() {
	
}
public Employee(String name, String gender, int age, long empId, String deptNo, double salary) {
	super(name, gender, age);
	this.empId= empId;
	this.deptNo= deptNo;
	this.salary= salary;
}
public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId= empId;
}
public String getDeptNo() {
	return deptNo;
}
public void setDeptNo(String deptNo) {
	this.deptNo= deptNo;
}
public double salary() {
	return salary;
}
public void setSalay(double salary) {
	this.salary= salary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", deptNo=" + deptNo + ", salary=" + salary + ", getName()=" + getName()
			+ ", getGender()=" + getGender() + ", getAge()=" + getAge() + "]";
}
@Override
public int hashCode() {
	return Objects.hash(deptNo, empId, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(deptNo, other.deptNo) && empId == other.empId
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
//@Override
//public int hashCode() {
	//int code= this.hashCode()*32*((int)this.empId)*(this.getName().length())*this.deptNo.length();
	//return super.hashCode();
}

