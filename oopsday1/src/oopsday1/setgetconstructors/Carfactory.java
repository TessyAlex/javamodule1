package oopsday1.setgetconstructors;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Car c = new Car()// default constructor, it will take default values
		// TODO Auto-generated method stub
		Car jag = new Car("Yellow",7000000,"Toyota","Innova");// parameterized constructor, it will take the value passed to it.
		System.out.println(jag.hashCode());
		System.out.println(Integer.toHexString(jag.hashCode()));
		System.out.println(jag);
		
		
	}

}
