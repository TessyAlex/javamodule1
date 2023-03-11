package userdefinedobjects;

//import java.util.Collection;
import java.util.HashMap;
//import java.util.Iterator;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		String str="This class consists exclusively of static methods that operate on or return collections. It contains polymorphic algorithms that operate on collections, \"wrappers\", which return a new collection backed by a specified collection, and a few other odds and ends.The methods of this class all throw a NullPointerException if the collections or class objects provided to them are null.The documentation for the polymorphic algorithms contained in this class generally includes a brief description of the implementation. Such descriptions should be regarded as implementation notes, rather than parts of the specification. Implementors should feel free to substitute other algorithms, so long as the specification itself is adhered to. (For example, the algorithm used by sort does not have to be a mergesort, but it does have to be stable.)";
		String[] arr=str.split(" ");
		//int count=0;
		System.out.println(arr.length);
		HashMap<String, Integer> test= new HashMap<>();
		for(String str1: arr) {
		            
		if(test.get(str1)==null) {
			test.put(str1, 1);
		}
		else {
			int i= test.get(str1);
		    i++;
			test.put(str1, i);
		}
		
	}

	System.out.println(test);
}
}

