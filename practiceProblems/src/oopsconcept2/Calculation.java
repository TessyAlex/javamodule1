package oopsconcept2;/*Print the average of three numbers entered by user by creating a 
                       class named 'Average'having a method to calculate and print the average*/

import java.util.Scanner;

class Average {
	 private int a, b, c, avg;
	
Average() {
	// TODO Auto-generated constructor stub
}

Average(int a, int b, int c) {
	super();
	this.a = a;
	this.b = b;
	this.c = c;
}


public void getAverage() {
	avg=(a+b+c)/3;
	System.out.println(avg);
}
}	
	
public class  Calculation{
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 3 numbers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		Average av= new Average(a,b,c);
		av.getAverage();
	}

}
