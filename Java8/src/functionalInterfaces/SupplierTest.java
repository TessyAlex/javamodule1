package functionalInterfaces;
import java.util.Supplier;
import java.util.function.Function;
import java.util.Arrays;
import java.util.List;

public class SupplierTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra Pradesh",
				"TamilNadu", 
				"Kerala",
				"Telangana",
				"Karnataka");
	
	Supplier<String> supplier = ()-> {
		return new String("Hola!");
	};
	
	System.out.println(supplier.get());
	}
	
	}


// predicate, test
// consume, accept
// supplier, get
// function, apply