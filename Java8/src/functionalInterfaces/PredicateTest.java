package functionalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
public class PredicateTest {

	public static void main(String[] args) {
        List<String> strings = Arrays.asList("Andhra Pradesh",
							"TamilNadu", 
							"Kerala",
							"Telangana",
							"Karnataka");

        Predicate<String> p=(String str) ->{ // the reason why we didnt give Predicate<String, boolean> is that it is already known automatically
        	return str.length()> 10;
        };
        System.out.println(p.test("Holla!"));// test is an inbuilt function which will return boolean value.
        for(String str: strings)
        	System.out.println(p.test(str));
        	desiredLength(strings,p);
	}
	public static void desiredLength(List<String> strings, Predicate<String> p) {// method
		
		for(String str : strings) {
			   System.out.println(p.test(str));
		   }
	}

}
