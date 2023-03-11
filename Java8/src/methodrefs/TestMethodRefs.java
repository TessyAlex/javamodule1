package methodrefs;

import java.util.Arrays;
import java.util.List;

interface Formula{
	
	public void m1();

}
class some{
		public static void m2() {
			System.out.println("from m2...");
		}
}
class other{
	other(){
		System.out.println("from other constructor");
	}
	void m2() {
		System.out.println("from m2()");
	}
}
public class TestMethodRefs {

	public static void main(String[] args) {
		
		Formula f= some::m2;// ::- method references in java 8
		f.m1();
		
		f = Other::new;
		
		List<String> list= Arrays.asList("one","two","three");
		list.stream(),forEach(System.out::println);//instance method reference
		List<Integer> intList = Arrays.asList(12,32,1323,11);
		Opional<Integer> num= intList.stream().reduce(Math::max);
		System.out.println(num.get());
	}

}
