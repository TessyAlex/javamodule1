package factoryMethod;

public class UseVehicleFactory {
	
	public static void main(String[] args) {
		//VehicleFactory factory= new VehicleFactory();
		
		Vehicle seltos= VehicleFactory.newInstance("Seltos");
		seltos.start();
		Vehicle XCross= VehicleFactory.newInstance("XCross");
		XCross.move();
		
	}

}
