package day4.polymorphism;
import java.awt.Shape;

public class TestShape {
	public static void main(String[] args) {
		Shape s= new rectangle(10.25,65.75);
		double result= s.area();
		System.out.println(result);
		
		s= new square(10.25);
		result = s.area();
		System.out.println(result);
		
		s= new circle(10.25);
		result = s.area();
		System.out.println(result);
	}
	
}
