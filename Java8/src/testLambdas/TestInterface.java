package testLambdas;

@FunctionalInterface
public interface TestInterface {
	
	
	public double method();
	public default void method2() {// inside a class we cant give default, but only in an interface we can give it.
		System.out.println("from method2");
	}
	public static void method3() {
		System.out.println("from static method");
	}
	
}
