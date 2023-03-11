package day4.polymorphism;

public class square {
	private double side;
	

	
public square() {
	
}


public square(double side) {
	super();
	this.side = side;
	
}
public double getSide(){
	return side;
}
public void setSide(double side) {
	this.side=side;
}
public double area() {
	return this.side* this.side;
}


@Override
public String toString() {
	return "square [side=" + side + "]";
}






}


