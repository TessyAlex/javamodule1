package functionalInterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FuctionTest {

	public static void main(String[] args) {
	
		List<String> strings = Arrays.asList("Andhra Pradesh",
							"TamilNadu", 
							"Kerala",
							"Telangana",
							"Karnataka");
    //Function<input, output(return)>
	Function<String, Integer> f = (str) -> {
							
											return str.length();
	
	                                      };
	Function<String, String> u = (str) -> {
										
											return str.toUpperCase();
										  };
	
	Function<String, String> l = (str) -> {
		
		                                    return str.toLowerCase();
										};
    
   Function<String, String> r = (str) -> {
		
                                           StringBuilder sb= new StringBuilder(str);
                                           sb.reverse();
                                           String rev= sb.toString();
                                           return rev;
    };
    
	   printLength(strings,f);
	   printUpperCase(strings,u);
	   printLowerCase(strings,l);
	   printReverse(strings,r);
	}// main ends


	public static void printLength(List<String> strings, Function<String,Integer> fRef) {// method
	
	for(String str : strings) {
		   System.out.println(fRef.apply(str));
	   }
}
	public static void printUpperCase(List<String> strings, Function<String,String> uRef) {// method
		
		for(String str : strings) {
			   System.out.println(uRef.apply(str));
		   }
	}//
	
	public static void printLowerCase(List<String> strings, Function<String,String> lRef) {// method
	
	for(String str : strings) {
		   System.out.println(lRef.apply(str));
	   }
}
public static void printReverse(List<String> strings, Function<String,String> rRef) {// method
	
	for(String str : strings) {
		   System.out.println(rRef.apply(str));
	   }
}
	
	}//end of class
	

