package oopsday1;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jag = new Car();
		jag.color = "Black";
		jag.price = 5000000;
		jag.brand = "Jaguar";
		jag.model = "Jaguar XK";
		System.out.println(jag.color);
		System.out.println(jag.price);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		
		Car bmw = new Car();
		bmw.color = "Blue";
		bmw.price = 8000000;
		bmw.brand = "BMW";
		bmw.model = "Luxury SUV";
		System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);
		
		
		
	}

}
