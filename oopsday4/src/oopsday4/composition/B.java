package oopsday4.composition;
// A is the base class and B is the inherited class.
public class B extends A { // extends means inheritance, A is the parent, B is the child.
	/*B(){
	 system.out.println(x+y)// here error since x is private
}*/
	public B(){
		super(10,20);// it changes the behaviour of default constructor and call the parameterized constructor of parent class
		// super should be in the first uncommented line inside the constructor
		// constructor call always should be in the first line.
	}
}
