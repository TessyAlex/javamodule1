package oopsday1.setget;

public class Carfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jag = new Car();
		jag.setColor("Black");
		jag.setPrice(5000000);
		jag.setBrand("Jaguar");
		jag.setModel("Jaguar XK");
		System.out.println(jag.getColor());
		System.out.println(jag.getPrice());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());
		
		Car bmw = new Car();
		bmw.setColor("Blue");
		bmw.setPrice(8000000);
		bmw.setBrand("BMW");
		bmw.setModel("Luxury SUV");
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
		
		
		
	}

}
