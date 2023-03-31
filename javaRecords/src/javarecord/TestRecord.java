package javarecord;
import java.util.HashMap;

public class TestRecord {

	public static void main(String[] args) {
		Person John= new Person("John", 30);
		Person George= new Person("George", 80);
		
		
		System.out.println(John.name());// prints John
		System.out.println(George.age());// prints George
		
		HashMap map= new HashMap();
	}

}
