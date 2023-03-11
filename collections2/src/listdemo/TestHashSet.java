package listdemo;
import java.util.HashSet;
import java.util.Iterator;
public class TestHashSet {

	public static void main(String[] args) {
		HashSet<String> bookSet= new HashSet<>();
		bookSet.add("java in nutshell");
		bookSet.add("java complete referance");
		bookSet.add("java in 21 days");
		bookSet.add("Thinking in Java");
		bookSet.add("java for dummys");
		// null value allowed
		bookSet.add(null);
		bookSet.add(null);

		System.out.println(bookSet);
		System.out.println(bookSet.size());
		System.out.println(bookSet.contains("java in nutshell"));
		
		bookSet.add("Thinking in java");
		System.out.println(bookSet.size());
		
		for(String book: bookSet) {
		System.out.println(book);
		}	
		
	}

}
