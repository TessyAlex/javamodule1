package day4.polymorphism;

public class circle {
	private double radius;
	

	
	public circle() {
		
	}


	public circle(double radius) {
		super();
		this.radius = radius;
		
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double area() {
		return Math.PI*this.radius*this.radius;
	}


	@Override
	public String toString() {
		return "circle [radius=" + radius + "]";
	}







	}




