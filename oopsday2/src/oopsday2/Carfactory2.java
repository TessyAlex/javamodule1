package oopsday2;

public class Carfactory2 {

	public static void main(String[] args) {
		
		//CarIface car = new CarIface(); there can be class for class but not for interface.
		//CarIface car; //// not referring to any object
		
		CarIface car = new Car(5000,500,0, false);
		//interface always on the left side so that they will be able to call the method not implement the method.
		car.start();
		car.honk();
		car.move();
		car.stop();
	}

}
