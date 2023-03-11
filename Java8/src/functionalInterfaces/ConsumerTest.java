package functionalInterfaces;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("Andhra Pradesh",
				"TamilNadu", 
				"Kerala",
				"Telangana",
				"Karnataka");
		Consumer consumer = (str) ->{
				System.out.println(str);
		};
		
		consumer.accept("I am doing Great");
		for(String str: strings) {
			consumer.accept(str);
		}
		printStrings(strings, consumer);
	}// end of main
	
	public static void printStrings(List<String> strings, Consumer<String> c) {// method
		
		for(String str : strings) {
			   c.accept(str);
		   }
}
}
