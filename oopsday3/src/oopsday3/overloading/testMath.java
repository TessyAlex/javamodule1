package oopsday3.overloading;

public class testMath {

	public static void main(String[] args) {
		math math = new math();
		int result = math.add(10,20);
		System.out.println(result);
		result = math.add(10,  20, 30);
		System.out.println(result);
		double result2=math.add(10.25, 25.25);
		System.out.println(result2);
		result2=math.add(10.25, 25.25, 35.5);
		System.out.println(result2);
		result2=math.add(10L, 25L, 35L);
		System.out.println("Long="+result2);
		result2= math.add(10.25f,  20.25f);
		System.out.println("float="+result2);
		
	}

}
