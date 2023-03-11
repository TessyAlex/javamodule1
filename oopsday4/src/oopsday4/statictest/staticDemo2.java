package oopsday4.statictest;

public class staticDemo2 {
	static int a;
public static void method() {
	System.out.println("from method");
	//method2();  // it is non static and it will will give an error as method is static. static will only take or call static.
}
public void method2() {
	System.out.println(a);
	method();// here the method2 is an instance method(non static),  instance method can call or take static,therefore it will give output
}
}
