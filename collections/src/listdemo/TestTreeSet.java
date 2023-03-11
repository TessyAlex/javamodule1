package listdemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TestTreeSet {


		public static void main(String[] args) {
			TreeSet<String> bookSet= new TreeSet<>();
			bookSet.add("java in nutshell");
			bookSet.add("java complete referance");
			bookSet.add("java in 21 days");
			bookSet.add("Thinking in Java");
			bookSet.add("java for dummys");
			//bookSet.add(null); // treeset does not allow null values.

			System.out.println(bookSet);
			System.out.println(bookSet.size());
			System.out.println(bookSet.contains("java in nutshell"));
			
			bookSet.add("Thinking in java");
			System.out.println(bookSet.size());
			
			for(String book: bookSet) {
			System.out.println(book);
			}	
			Iterator<String> iter= bookSet.iterator();
			while(iter.hasNext()) { // checking if there is a next element
				System.out.println(iter.next());
		}

	}
	}

//null value is not allowed