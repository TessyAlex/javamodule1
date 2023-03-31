package oopsconcept1;   /*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5units
						  by creating a class named 'Triangle' without any parameter in its constructor.*/

class Triangle {

	private int length, breadth, height;
	
	Triangle() {
		length=3;
		breadth=4;
		height=5;
	}
	
	
	public void getArea() {
	
		System.out.println(length*breadth*height);
	
	}
}
	
	
	public class Area{
	public static void main(String[] args) {
		
		Triangle T= new Triangle();
		T.getArea();

	}

}

