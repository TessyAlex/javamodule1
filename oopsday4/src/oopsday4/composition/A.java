package oopsday4.composition;

public class A {
	
	private int x;
	private int y;
	
	A(){
		System.out.println("from A()");
	}
	public A(int x, int y) {
		super();
		this.x =x;
		this.y = y;
		System.out.println("from A(int,int)");
	}
}
