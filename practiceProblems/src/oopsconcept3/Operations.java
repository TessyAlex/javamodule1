package oopsconcept3; /*Print the  sum,  difference  and   product of   two  complex numbers by  creating a   
						classnamed 'Complex' with separate methods for
 						each operation whose real and imaginaryparts are entered by user.*/

import java.util.Scanner;

class Complex{
	private int a,b, sum, difference, product;
	
	Complex() {
		// TODO Auto-generated constructor stub
	}

	Complex(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public void sum() {
		sum= a+b;
		System.out.println(sum);
	}
	public void difference() {
		difference=a-b;
		System.out.println(difference);
	}
	public void product() {
		product=a*b;
		System.out.println(product);
	}
}

public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		Complex c= new Complex(a,b);
		c.sum();
		c.difference();
		c.product();
		
	
	}

}
