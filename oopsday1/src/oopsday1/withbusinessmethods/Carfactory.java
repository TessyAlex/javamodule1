package oopsday1.withbusinessmethods;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jag = new Car("Yellow",7000000,"Toyota","Innova");
		jag.start();
		jag.changeGear(1);
		jag.stop();
		
		Car bmw = new Car("White",6500000,"BMW","Sports SUV");
		bmw.start();
		bmw.changeGear(1);
		bmw.stop();
		
		
	}

}
